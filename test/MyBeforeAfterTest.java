import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MyBeforeAfterTest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("BeforeAll••••••••••••••••••••••••");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("BeforeEach•••••••••••••");
    }

    @Test
    void test1(){
        System.out.println("•••Test1");
    }

    @Test
    void test2(){
        System.out.println("•••Test2");
    }

    @Test
    void test3(){
        System.out.println("•••Test3");
    }

    @AfterEach
    void afterEach(){
        System.out.println("AfterEach••••••••••••••");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("AfterAll•••••••••••••••••••••••••");
    }

}
