package com.lgy.spring_9_1;

import org.aspectj.lang.ProceedingJoinPoint;

// 공통기능(Aspect) 클래스
public class LogAop {
//	joinPoint : 공통기능이 적용되는 대상(핵심 기능 즉, 메소드이다)
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {
//		getSignature().toShortString() : 핵심기능 클래스의 메소드 정보를 가지고 옴
		String signatureStr = joinPoint.getSignature().toShortString();
//		공통기능 실행(advice) - 핵심기능이 start 되었다
		System.out.println(signatureStr + "is start.");
		long st = System.currentTimeMillis(); // st = start time
		Object obj = null;
		
//		방법 1)
//		try {
//			// 핵심기능 실행
//			obj = joinPoint.proceed(); // 예외처리 추가
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			// 공통기능 실행(advice)
//			long et = System.currentTimeMillis(); // et = end time
//			System.out.println(signatureStr + "is finished");
//			System.out.println(signatureStr + "의 경과시간 : " + (et - st));
//		}
//		return obj;
		
//		방법 2)
		try {
			// 핵심기능 실행
			obj = joinPoint.proceed(); // 예외처리 추가
			return obj;
		} finally {
			// 공통기능 실행(advice)
			long et = System.currentTimeMillis(); // et = end time
			System.out.println(signatureStr + "is finished");
			System.out.println(signatureStr + "의 경과시간 : " + (et - st));
		}
	}
}
