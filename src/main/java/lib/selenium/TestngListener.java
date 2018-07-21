package lib.selenium;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class TestngListener implements IAnnotationTransformer,IRetryAnalyzer{

	int maxcount=1;	
	
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		String suiteName = annotation.getSuiteName();
		int successPercentage = annotation.getSuccessPercentage();
		annotation.getClass();
		String dataProvider = annotation.getDataProvider();
		System.out.println("Suite Name:"+suiteName+"\nSuccess Percentage:"+successPercentage+"\nData Provider:"+dataProvider);
		annotation.setRetryAnalyzer(this.getClass());
		if(testMethod.getName().equals("createLead")) {
			annotation.setTimeOut(10000);
			annotation.setInvocationCount(2);
		}
	}

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(!result.isSuccess()) {
			maxcount++;
			return true;
		}
		return false;
	}

}
