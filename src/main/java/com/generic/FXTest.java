package com.generic;

/**
 * @ClassName: FXTest
 * @Description: Description
 * @Author: LH
 * @CreateDate: 2021/12/21
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2021/12/21
 * @UpdateRemark: UpdateRemark
 */
public class FXTest {

    TestA a = new TestA(123);
    TestA b = new TestA("123");

    private void getClass1(TestA<?> test) {

    }
    private <T> void getClass2(TestA<T> test) {

    }

    public static void showKeyValue(Generic<?> obj){
        System.out.println("泛型测试，key value is " + obj.getKey());
    }

    public static void main(String[] args) {

        Generic<Integer> gInteger = new Generic<Integer>(123);
        Generic<Number> gNumber = new Generic<Number>(456);

        FXTest.showKeyValue(gNumber);
        FXTest.showKeyValue(gInteger);


        // List<String> stringArrayList = new ArrayList<String>();
        // List<Integer> integerArrayList = new ArrayList<Integer>();
        //
        // Class classStringArrayList = stringArrayList.getClass();
        // Class classIntegerArrayList = integerArrayList.getClass();
        //
        // if(classStringArrayList.equals(classIntegerArrayList)){
        //     System.out.println("泛型测试，类型相同");
        // }
    }

}

class TestA<T> {
    private T t;

    public TestA(T t) {
        this.t = t;
    }
}
