package com.rp.sec01;

import com.rp.courseutil.Util;
import reactor.core.publisher.Mono;

import java.util.function.Consumer;

public class Lec02MonoSubscribe {

    public static void main(String[] args) {

        //PUBLISHER
        Mono<Integer> mono = Mono.just("ball")
                                .map(String::length)
                                .map(l -> l / 1);


        // 1
        mono.subscribe();

        //2
        mono.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );

        //
    }
}
