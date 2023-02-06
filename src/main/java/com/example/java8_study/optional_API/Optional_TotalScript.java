package com.example.java8_study.optional_API;

import com.example.java8_study.stream_API.OnlineClass;
import com.example.java8_study.stream_API.Progress;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Optional_TotalScript {
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();

        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(5, "rest api development", false));


        // spring변수의 타입이 Optional인 이유 : spring이라고 시작하는 것이 있을 수도 없을 수도 있기 때문이다.
        Optional<OnlineClass> spring = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

        boolean presnet = spring.isPresent();
        System.out.println(presnet);  //true

        // --------------------------------

        // jpa라는 변수에 시작하는 단어가 jpa라는 것이 있나 ?  없다.
        Optional<OnlineClass> jpa = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("jpa"))
                .findFirst();

        boolean present2 = jpa.isPresent();
        System.out.println(present2); // false

        // --------------------------------

        Optional<OnlineClass> isEmptyEx = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("jpa"))
                .findFirst();

        boolean present3 = isEmptyEx.isEmpty(); //boolean present2 = jpa.isPresent()에서 바꿈
        System.out.println(present3); // true

        //-----------------------------------

        //값 가져오기
        Optional<OnlineClass> optional = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

        OnlineClass onlineClass1 = optional.get();
        System.out.println(onlineClass1.getTitle()); // spring boot


        //get() : 값이 없는데 가져오면 ...
        Optional<OnlineClass> isEmptyOptional = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("jpa"))
                .findFirst();

        //OnlineClass onlineClass2 = isEmptyOptional.get();
        //System.out.println(onlineClass2.getTitle()); // 런타임 Exception : NoSuchElementException

        //해결법 : 확인을 하고 꺼내라! 하지만 좋은 방법은 아니다. Optional이 제공하는 다양한 메소드를 이용하는 것이 제일 좋다.
        if(isEmptyOptional.isPresent()){
            OnlineClass onlineClass2 = isEmptyOptional.get();
            System.out.println(onlineClass2.getTitle()); // 런타임 Exception : NoSuchElementException
        }

        //ifPresent를 이용 해서
        isEmptyOptional.ifPresent(oc -> {
            System.out.println(oc.getTitle());
        });


        // 무조건 OnlineClass 타입으로 받아하는 조건일 때  : orElse 있으면 가져오고, 없으면 새로운 클래스를 만들어라
        // orElse(인스턴스) -> Optional이 감싸고 있는 인스턴스를 넘겨준다.
        OnlineClass onlineClass3 = isEmptyOptional.orElse(createNewClass());
        System.out.println(onlineClass3.getTitle());


        //orElseGet(Supplier) 사용
        OnlineClass onlineClass4 = optional.orElseGet(() -> createNewClass());
        //OnlineClass onlineClass4 = optional.orElseGet(OptionalEx1::createNewClass); //메소드 레퍼런스로 구현

        System.out.println(onlineClass4.getTitle());


        //orElseThrow() -> 원하는 에러가 있다면 (Supplier)로 제공 () -> {}
        OnlineClass onlineClass5 = optional.orElseThrow();
        System.out.println(onlineClass5.getTitle());

        OnlineClass onlineClass6 = optional.orElseThrow(() -> {
            return new IllegalArgumentException();
        });

        // 메소드 레퍼런스로 생성자 참조
        OnlineClass onlineClass7 = optional.orElseThrow(IllegalStateException::new);
        System.out.println(onlineClass7.getTitle());


        // Optional에 들어있는 값 걸러내기 - Optional.filter(Predicate)
        Optional<OnlineClass> onlineClass8 = optional.filter(oc -> !oc.isClosed());
        System.out.println(onlineClass8.isEmpty());

        Optional<OnlineClass> onlineClass9 = optional.filter(OnlineClass::isClosed);
        System.out.println(onlineClass9.isPresent());


        //map을 사용
        Optional<Integer> integer = optional.map(OnlineClass::getId);
        System.out.println(integer.isPresent());

        // map으로 변환한 타입이 Optional 이다 ? ->
//        Optional<Optional<Progress>> progress = optional.map(OnlineClass::getProgress);
//        Optional<Progress> progress1 = progress.orElseThrow();
//        progress1.orElseThrow();

        // Optional.flatMap()  -> cf.stream.flatMap()는 1:1 맵핑
        //                          stream.flatMap은 List에 List를 담고 잇는 컨테이너 성격에 있는걸 꺼낼 때 쓰인다.
        //                          input은 하나, output은 여러 개일 때 사용한다.
        Optional<Progress> progress = optional.flatMap(OnlineClass::getProgress); // 아래꺼를 한번에 해결

        Optional<Optional<Progress>> progress1 = optional.map(OnlineClass::getProgress);
        Optional<Progress> progress2 = progress1.orElse(Optional.empty());




    }



    private static OnlineClass createNewClass() {
        System.out.println("creating new online class");
        return new OnlineClass(10, "New class", false);
    }
}
