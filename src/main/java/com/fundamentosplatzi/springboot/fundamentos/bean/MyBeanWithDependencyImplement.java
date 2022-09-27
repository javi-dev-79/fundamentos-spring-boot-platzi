package com.fundamentosplatzi.springboot.fundamentos.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

    Log LOGGER = LogFactory.getLog((MyBeanWithDependency.class));
    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        LOGGER.info("Hemos ingresado al método printWithDependency");
        int numero = 1;
        LOGGER.debug("El número enviado como parámetro a la dependencia de operación es: " + numero);
        System.out.println(myOperation.sum(numero));
        System.out.println("Hola desde la implementación de un bean con dependencia");
    }
}
