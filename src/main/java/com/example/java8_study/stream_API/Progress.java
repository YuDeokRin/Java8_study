package com.example.java8_study.stream_API;

import java.time.Duration;

public class Progress {

    private Duration studyDuration;

    private boolean finished;

    public Duration getStudyDuration(){
        return studyDuration;
    }

    public void setStudyDuration(Duration studyDuration){
        this.studyDuration = studyDuration;
    }
}
