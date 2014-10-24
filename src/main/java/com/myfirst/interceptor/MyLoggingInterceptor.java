package com.myfirst.interceptor;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

public class MyLoggingInterceptor extends AbstractPhaseInterceptor<Message> {

	public MyLoggingInterceptor() {
		 super(Phase.RECEIVE);
	}

	@Override
	public void handleMessage(Message arg0) throws Fault {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println(arg0);
		System.out.println("-------- Message handled --------");
	}
}
