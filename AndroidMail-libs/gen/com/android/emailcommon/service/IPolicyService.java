/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/wuyexiong/Desktop/AndroidMail/AndroidMail-libs/src/com/android/emailcommon/service/IPolicyService.aidl
 */
package com.android.emailcommon.service;
public interface IPolicyService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.emailcommon.service.IPolicyService
{
private static final java.lang.String DESCRIPTOR = "com.android.emailcommon.service.IPolicyService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.emailcommon.service.IPolicyService interface,
 * generating a proxy if needed.
 */
public static com.android.emailcommon.service.IPolicyService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.emailcommon.service.IPolicyService))) {
return ((com.android.emailcommon.service.IPolicyService)iin);
}
return new com.android.emailcommon.service.IPolicyService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_isActive:
{
data.enforceInterface(DESCRIPTOR);
com.android.emailcommon.provider.Policy _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.emailcommon.provider.Policy.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.isActive(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setAccountHoldFlag:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setAccountHoldFlag(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setAccountPolicy:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
com.android.emailcommon.provider.Policy _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.emailcommon.provider.Policy.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _arg2;
_arg2 = data.readString();
this.setAccountPolicy(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_remoteWipe:
{
data.enforceInterface(DESCRIPTOR);
this.remoteWipe();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.emailcommon.service.IPolicyService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public boolean isActive(com.android.emailcommon.provider.Policy policies) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((policies!=null)) {
_data.writeInt(1);
policies.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_isActive, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setAccountHoldFlag(long accountId, boolean newState) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(accountId);
_data.writeInt(((newState)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAccountHoldFlag, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setAccountPolicy(long accountId, com.android.emailcommon.provider.Policy policy, java.lang.String securityKey) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(accountId);
if ((policy!=null)) {
_data.writeInt(1);
policy.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(securityKey);
mRemote.transact(Stub.TRANSACTION_setAccountPolicy, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void remoteWipe() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_remoteWipe, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_isActive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setAccountHoldFlag = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setAccountPolicy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_remoteWipe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public boolean isActive(com.android.emailcommon.provider.Policy policies) throws android.os.RemoteException;
public void setAccountHoldFlag(long accountId, boolean newState) throws android.os.RemoteException;
public void setAccountPolicy(long accountId, com.android.emailcommon.provider.Policy policy, java.lang.String securityKey) throws android.os.RemoteException;
public void remoteWipe() throws android.os.RemoteException;
}
