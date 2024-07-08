package Java_8;


public class LambdaExpressionTest {

	public static void main(String[] args) {
		// No param No return type
		/*TestFuncInterface func= ()-> System.out.println("Hello world");
		func.displayMessage();*/
		
		// 1 param and return type
		/*TestReturnFuncInterface rFunc = (name1) -> "Hello " + name1;
		String msg=rFunc.displayMessage("Ram");
		System.out.println(msg);*/

		// 2 param No return type
		/*AddFuncInterface addFun = (a,b) -> System.out.println("Sum=" + (a + b));
		addFun.add(10, 20);*/

		// 2 param and return type
		AddReturnFuncInterface addRetFun = (int a, int b) -> a+b;
		int res=addRetFun.add(10, 20);
		System.out.println("(Return)Sum="+res);
		
		
		AddReturnFuncInterface addRetFun1 = ( a,  b) -> {
			System.out.println("1st operand="+a);
			System.out.println("2nd operand="+b);
			return a+b;
		};
		int res1=addRetFun1.add(10, 20);
		System.out.println("(Return)Sum="+res1);
		
		/*Student std=new Student(1, "Ram", 65, null);
		GradeCalculator gc=(Student s)->{
			if(s.percent>90) {
				return "A";
			} else if(s.percent>60) {
				return "B";
			}else if(s.percent>40) {
				return "C";
			}
			return "D";
		};
		String grade=gc.calculateGrade(std);
		System.out.println("Calculated grade:"+grade);*/
	}

}
