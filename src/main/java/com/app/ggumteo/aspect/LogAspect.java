package com.app.ggumteo.aspect;

import com.app.ggumteo.domain.funding.MyBuyFundingListDTO;
import com.app.ggumteo.domain.funding.MyFundingBuyerListDTO;
import com.app.ggumteo.domain.funding.MyFundingListDTO;
import com.app.ggumteo.domain.inquiry.MyInquiryHistoryListDTO;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.stream.Collectors;

@Aspect
@Slf4j
@Configuration
public class LogAspect {
    @AfterReturning(value = "@annotation(com.app.ggumteo.aspect.annotation.MyFundingListLogStatus)", returning = "returnValue")
    public void afterReturningMyFundingList(JoinPoint joinPoint, MyFundingListDTO returnValue) {
        log.info("method: {}", joinPoint.getSignature().getName());
        log.info("arguments: {}", Arrays.stream(joinPoint.getArgs()).map(String::valueOf).collect(Collectors.joining(", ")));
        log.info("returnValue: {}", returnValue);
    }

    @AfterReturning(value = "@annotation(com.app.ggumteo.aspect.annotation.MyBuyFundingListLogStatus)", returning = "returnValue")
    public void afterReturningMyBuyFundingList(JoinPoint joinPoint, MyBuyFundingListDTO returnValue) {
        log.info("method: {}", joinPoint.getSignature().getName());
        log.info("arguments: {}", Arrays.stream(joinPoint.getArgs()).map(String::valueOf).collect(Collectors.joining(", ")));
        log.info("returnValue: {}", returnValue);
    }

    @AfterReturning(value = "@annotation(com.app.ggumteo.aspect.annotation.MyFundingBuyerListLogStatus)", returning = "returnValue")
    public void afterReturningMyFundingBuyerList(JoinPoint joinPoint, MyFundingBuyerListDTO returnValue) {
        log.info("method: {}", joinPoint.getSignature().getName());
        log.info("arguments: {}", Arrays.stream(joinPoint.getArgs()).map(String::valueOf).collect(Collectors.joining(", ")));
        log.info("returnValue: {}", returnValue);
    }

    @AfterReturning(value = "@annotation(com.app.ggumteo.aspect.annotation.MyInquiryHistoryListLogStatus)", returning = "returnValue")
    public void afterReturningMyFundingBuyerList(JoinPoint joinPoint, MyInquiryHistoryListDTO returnValue) {
        log.info("method: {}", joinPoint.getSignature().getName());
        log.info("arguments: {}", Arrays.stream(joinPoint.getArgs()).map(String::valueOf).collect(Collectors.joining(", ")));
        log.info("returnValue: {}", returnValue);
    }


}