package com.example.java8_tutorial;

import java.util.List;

public class RosterTest {
    interface CheckPerson{
        boolean test(Person p);
    }

    //접근 1. 하나의 특성과 일치하는 사람을 검색하는 메서드 만들기
    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age){
                p.printPerson();
            }
        }
    }
    /*
       list는 is ordered Collection입니다. Collection은 여러 요소를 단일 단위로 그룹화하는 개체입니다. 컬렉션은 집계데이터를 저장, 검색, 조작, 및 전달하는데 사용한다.

      접근 1의 방식은 잠재적으로 애플리케이션을 취약하게 만둘 수 있다. 업데이트(ex. 최신 데이터 유형)의 도입으로 인해 애플리케이션이 작동하지 않을 가능성입니다.
      응용 프로그램을 업그레이드 Person하고 다른 멤버 변수를 포함하도록 클래스 구조를 변경한다고 가정한다면 아마도 클래스는 다른 데이터 유형이나 알고리즘으로 나이를 기록하고 측정한다.
      이 변경 상항을 수용하려면 많은 API를 다시 작성해야한다. 또한 이 접근 방식은 불필요하게 제한적이다.(ex. 특정 연령보다 어린 회원을 출력하려면 어떻게 해야할까 ?)
     */


    //접근 2. 일반화된 검색 방법 만들기.
    //다음 메소드는 printPersonsOlderThan보다 더 일반적입니다. 지정된 연령 범위 내의 구성원 출력한다.
    public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) { // Person의 데이터가 low보다 같거나 크고 high보다 작으면  -> 참
                p.printPerson(); // ptintPerson() 호출
            }
        }
    }
    /*
        지정된 성별의 구성원을 출력하거나 지정된 성별의 연령 범위의 조합을 출력하려면 어떻게 해야합니까 ?
        Person클래스를 변경하고 관계 상태 또는 지리적 위치와 같은 다른 속성을 추가하기로 결정했다면 어떻게 될가요 ?
        이 메서드가 PrintPersonsOlderThan보다 더 일반적이지만 가능한 각 검색 쿼리에 대해 별도의 메서드를 만들려고 하면 여전히 코드가 잘 안 나올 수 있다.
        대신 다른 클래스에서검색하려는 기준을 지정하는 코드를 분리할 수 있다.
     */


    // 접근 3. 로컬클래스에서 검색 기준 코드 지정
    //지정한 검색 기준과 일치하는 멤버를 출력.
    public static void printPersons(List<Person> roster, CheckPerson tester){
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
    /*
        이 메서드는 tester.test 메소드를 호출하여 List 매개변수 명부에 포함된 각 Person 인스턴스가 CheckPerson 매개변수 tester에 지정된 검색 기준을 충족하는지 확인합니다.
        tester.test()가 true 값을 반환하면, printPerson()가 Person 인스턴스에서 호출된다.
        검색 기준을 지정하려면 CheckPerson 인터페이스를 구현한다.

        다음 클래스는 메서드 테스트에 대한 구현을 지정하여 CheckPerson 인터페이스를 구현한다.
     */




    // 이 메소드는 미국에서 병역에 적격한 구성원을 필터링한다. Person 매개변수가 남성이고 18세에서 25세 사이인 경우 true 값을 반환한다.
    class CheckPersonEligibleForselectiveService implements CheckPerson {
        public boolean test(Person p) {
            return p.gender == Person.Sex.MALE &&
                    p.getAge() >= 18 &&
                    p.getAge() <= 25;
        }
    }
}
