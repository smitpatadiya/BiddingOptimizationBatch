package com.bidding.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.bidding.config.BaseConfig;
import com.bidding.service.UpdateClientServiceImpl;

public class UpdateClientTasklet implements Tasklet, InitializingBean {

	@Autowired
	UpdateClientServiceImpl clientServiceImpl;
	
	@Autowired
	BaseConfig config;

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		System.out.println(config.getClientId()+ " Update Configuration!" + clientServiceImpl);

		return RepeatStatus.FINISHED;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
	}

}
