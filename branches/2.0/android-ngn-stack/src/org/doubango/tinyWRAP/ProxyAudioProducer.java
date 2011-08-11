/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.39
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public class ProxyAudioProducer extends ProxyPlugin {
  private long swigCPtr;

  protected ProxyAudioProducer(long cPtr, boolean cMemoryOwn) {
    super(tinyWRAPJNI.SWIGProxyAudioProducerUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ProxyAudioProducer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      tinyWRAPJNI.delete_ProxyAudioProducer(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public boolean setPushBuffer(java.nio.ByteBuffer pPushBufferPtr, long nPushBufferSize) {
    return tinyWRAPJNI.ProxyAudioProducer_setPushBuffer(swigCPtr, this, pPushBufferPtr, nPushBufferSize);
  }

  public int push(java.nio.ByteBuffer pBuffer, long nSize) {
    return tinyWRAPJNI.ProxyAudioProducer_push__SWIG_0(swigCPtr, this, pBuffer, nSize);
  }

  public int push(java.nio.ByteBuffer pBuffer) {
    return tinyWRAPJNI.ProxyAudioProducer_push__SWIG_1(swigCPtr, this, pBuffer);
  }

  public int push() {
    return tinyWRAPJNI.ProxyAudioProducer_push__SWIG_2(swigCPtr, this);
  }

  public boolean setGain(long nGain) {
    return tinyWRAPJNI.ProxyAudioProducer_setGain(swigCPtr, this, nGain);
  }

  public long getGain() {
    return tinyWRAPJNI.ProxyAudioProducer_getGain(swigCPtr, this);
  }

  public void setCallback(ProxyAudioProducerCallback pCallback) {
    tinyWRAPJNI.ProxyAudioProducer_setCallback(swigCPtr, this, ProxyAudioProducerCallback.getCPtr(pCallback), pCallback);
  }

  public java.math.BigInteger getMediaSessionId() {
    return tinyWRAPJNI.ProxyAudioProducer_getMediaSessionId(swigCPtr, this);
  }

  public static boolean registerPlugin() {
    return tinyWRAPJNI.ProxyAudioProducer_registerPlugin();
  }

}
