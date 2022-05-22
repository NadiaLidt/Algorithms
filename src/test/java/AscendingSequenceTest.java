import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AscendingSequenceTest {
    AscendingSequence as;

    @BeforeEach // это выполняется в каждом тесте, в частности здесь создание нового объекта (оставили это для негативных тестов)
    void setUp() {
        as = new AscendingSequence();
    }

    @Order(1)
    @RepeatedTest(50)
    @Test
    public void testAscendingSequenceHappyPathPositiveNumbers() {
        //0, 1, 2, 3, 4, 5
        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        AscendingSequence as = new AscendingSequence();//создание объекта класса
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);//вызов метода и складывание актуального результата в массив

        //в каждом тестовом фреймвоке есть свои асерты - это спец методы кот сравнивают рез-ты и выдают pass или fail
        //джюпитер-5 это и есть такой фреймворк

        Assertions.assertArrayEquals(expectedResult, actualResult);



    }

    @Order(2)
    @Test
    public void testAscendingSequenceHappyPathNegativeNumbers() {
        //-10, -9, -8, -7, -6, -5
        int start = -10;
        int end = -5;
        int step = 1;
        int[] expectedResult = {-10, -9, -8, -7, -6, -5};

        AscendingSequence as = new AscendingSequence();//создание объекта класса
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);//вызов метода и складывание актуального результата в массив

        //в каждом тестовом фреймвоке есть свои асерты - это спец методы кот сравнивают рез-ты и выдают pass или fail
        //джюпитер-5 это и есть такой фреймворк

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testAscendingSequenceHappyPathNegativePositiveNumbers() {
        //-3, -2, -1, 0, 1, 2
        int start = -3;
        int end = 2;
        int step = 1;
        int[] expectedResult = {-3, -2, -1, 0, 1, 2};

        AscendingSequence as = new AscendingSequence();//создание объекта класса
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);//вызов метода и складывание актуального результата в массив

        //в каждом тестовом фреймвоке есть свои асерты - это спец методы кот сравнивают рез-ты и выдают pass или fail
        //джюпитер-5 это и есть такой фреймворк

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testAscendingSequenceHappyPathStepTwo() {
        // 0, 2, 4
        int start = 0;
        int end = 5;
        int step = 2;
        int[] expectedResult = {0, 2, 4};

        AscendingSequence as = new AscendingSequence();//создание объекта класса
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);//вызов метода и складывание актуального результата в массив

        //в каждом тестовом фреймвоке есть свои асерты - это спец методы кот сравнивают рез-ты и выдают pass или fail
        //джюпитер-5 это и есть такой фреймворк

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


    @Test
    public void testAscendingSequenceSartLargerThenEnd() {
        int start = 5;
        int end = 0;
        int step = 2;
        int[] expectedResult = {};

        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);//вызов метода и складывание актуального результата в массив

        //в каждом тестовом фреймвоке есть свои асерты - это спец методы кот сравнивают рез-ты и выдают pass или fail
        //джюпитер-5 это и есть такой фреймворк

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


    @Test
    public void testAscendingSequenceNagativeStep() {
        int start = 0;
        int end = 5;
        int step = -1;
        int[] expectedResult = {};

        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);//вызов метода и складывание актуального результата в массив

        //в каждом тестовом фреймвоке есть свои асерты - это спец методы кот сравнивают рез-ты и выдают pass или fail
        //джюпитер-5 это и есть такой фреймворк

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


    @Test
    public void testAscendingSequenceStepIsZero() {
        int start = 0;
        int end = 5;
        int step = 0;
        int[] expectedResult = {};

        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);//вызов метода и складывание актуального результата в массив

        //в каждом тестовом фреймвоке есть свои асерты - это спец методы кот сравнивают рез-ты и выдают pass или fail
        //джюпитер-5 это и есть такой фреймворк

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }




}
