package net.madz.stochastic.utilities.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import net.madz.stochastic.core.IFunctionRegistry;
import net.madz.stochastic.utilities.processors.FunctionRegistryProcessor;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.TYPE, ElementType.FIELD })
@PerThreadSetup
@Processor(FunctionRegistryProcessor.class)
public @interface FunctionRegistry {

    Class<? extends IFunctionRegistry> value();
}
