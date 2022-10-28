package onboarding.problem2.domain;

import java.util.stream.IntStream;

public class IndexCalculator {
    private static final int NOT_EXIST_OVERLAP_CHARACTER = -1;
    
    public static int overlapStartIndex(final int overlapStartIndex, final String[] splitCryptogram) {
        return IntStream.range(overlapStartIndex, splitCryptogram.length - 1)
                .filter(index -> isOverlapStart(splitCryptogram, index))
                .findFirst()
                .orElse(NOT_EXIST_OVERLAP_CHARACTER);
    }
    
    private static boolean isOverlapStart(final String[] splitCryptogram, final int index) {
        return splitCryptogram[index].equals(splitCryptogram[index + 1]);
    }
    
    public static int overlapEndIndex(final int overlapStartIndex, final String[] splitCryptogram) {
        return IntStream.range(overlapStartIndex, splitCryptogram.length)
                .filter(index -> overlapStartIndex != NOT_EXIST_OVERLAP_CHARACTER)
                .filter(index -> isOverlapEnd(overlapStartIndex, splitCryptogram, index))
                .findFirst()
                .orElse(overlapStartIndex + 2);
    }
    
    private static boolean isOverlapEnd(final int overlapStartIndex, final String[] splitCryptogram, final int index) {
        return !splitCryptogram[overlapStartIndex].equals(splitCryptogram[index]);
    }
}
