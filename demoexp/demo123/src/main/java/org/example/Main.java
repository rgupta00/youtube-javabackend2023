package org.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> o=Optional.ofNullable("");
        System.out.println(o.orElse("not found"));
    }
}