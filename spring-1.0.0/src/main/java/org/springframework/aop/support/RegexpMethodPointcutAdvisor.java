/*
 * Copyright 2002-2004 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */ 

package org.springframework.aop.support;

import org.aopalliance.aop.Advice;

import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.core.Ordered;

/**
 * Convenient class for regexp method pointcuts that hold an Interceptor,
 * making them an Advisor.
 * @author Dmitriy Kopylenko
 * @version $Id: RegexpMethodPointcutAdvisor.java,v 1.4 2004/03/23 14:29:45 jhoeller Exp $
 */
public class RegexpMethodPointcutAdvisor extends RegexpMethodPointcut
    implements PointcutAdvisor, Ordered {

	private int order = Integer.MAX_VALUE;

	private Advice advice;

	public RegexpMethodPointcutAdvisor() {
	}

	public RegexpMethodPointcutAdvisor(Advice advice) {
		this.advice = advice;
	}
	
	public void setOrder(int order) {
		this.order = order;
	}

	public int getOrder() {
		return order;
	}

	public void setAdvice(Advice advice) {
		this.advice = advice;
	}
	
	public Advice getAdvice() {
		return this.advice;
	}

	public boolean isPerInstance() {
		throw new UnsupportedOperationException("perInstance property of Advisor is not yet supported in Spring");
	}

	public Pointcut getPointcut() {
		return this;
	}

}
