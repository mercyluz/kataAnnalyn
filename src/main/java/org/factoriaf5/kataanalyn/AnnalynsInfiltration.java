package org.factoriaf5.kataanalyn;

public class AnnalynsInfiltration {
   // 1. Check if a fast attack can be made
   public static boolean canFastAttack(boolean knightIsAwake) {
    return !knightIsAwake; // Fast attack is possible if the knight is sleeping.
}

// 2. Check if the group can be spied upon
public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
    return knightIsAwake || archerIsAwake || prisonerIsAwake; // Can spy if at least one is awake.
}

// 3. Check if the prisoner can be signalled
public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
    return prisonerIsAwake && !archerIsAwake; // Can signal if prisoner is awake and archer is sleeping.
}

// 4. Check if the prisoner can be freed
public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
    if (petDogIsPresent) {
        return !archerIsAwake; // Can free if archer is sleeping with dog present.
    } else {
        return prisonerIsAwake && !knightIsAwake && !archerIsAwake; // Sneaky rescue conditions.
    }
}
}