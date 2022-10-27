package onboarding.problem1.domain;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Pages {
    private static final String NOT_FOUND_PAGE_EXCEPTION_MESSAGE = "페이지를 찾지 못했습니다.";
    
    private final List<Page> pages;
    
    public Pages(final int leftPage, final int rightPage) {
        this(new Page(leftPage), new Page(rightPage));
    }
    
    public Pages(final Page leftPage, final Page rightPage) {
        this(Arrays.asList(leftPage, rightPage));
    }
    
    public Pages(final List<Page> pages) {
        this.pages = pages;
    }
    
    public int getMaxSum() {
        return pages.stream()
                .mapToInt(Page::sumOfDigits)
                .max()
                .orElseThrow(() -> new NoSuchElementException(NOT_FOUND_PAGE_EXCEPTION_MESSAGE));
    }
}
