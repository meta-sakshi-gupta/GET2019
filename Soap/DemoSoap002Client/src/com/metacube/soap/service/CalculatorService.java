/**
 * CalculatorService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.metacube.soap.service;

public interface CalculatorService extends java.rmi.Remote {
    public int multiply(int a, int b) throws java.rmi.RemoteException;
    public int addy(int a, int b) throws java.rmi.RemoteException;
    public java.lang.String sayHello() throws java.rmi.RemoteException;
}
