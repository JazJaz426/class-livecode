package edu.brown.cs32.live.main;

import edu.brown.cs32.live.repl.CommandFunction;

import java.util.List;

public class Prev implements CommandFunction {
    private final List<Integer> sharedCounter;

    // Ideally, this wouldn't be a list. We just need an object that's mutable so
    //  the objects can change the shared state!
    Prev(List<Integer> sharedCounter) {
        this.sharedCounter = sharedCounter;
    }

    @Override
    public String run(List<String> args) {
        // Using is a list is a really annoying option :/ better to make our own wrapper
        sharedCounter.set(0, sharedCounter.get(0)-1);
        return String.valueOf(sharedCounter.get(0));
    }
}
