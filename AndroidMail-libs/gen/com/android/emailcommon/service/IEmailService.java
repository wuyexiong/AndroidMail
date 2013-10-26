/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/wuyexiong/Desktop/AndroidMail/AndroidMail-libs/src/com/android/emailcommon/service/IEmailService.aidl
 */
package com.android.emailcommon.service;
public interface IEmailService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.emailcommon.service.IEmailService
{
private static final java.lang.String DESCRIPTOR = "com.android.emailcommon.service.IEmailService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.emailcommon.service.IEmailService interface,
 * generating a proxy if needed.
 */
public static com.android.emailcommon.service.IEmailService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.emailcommon.service.IEmailService))) {
return ((com.android.emailcommon.service.IEmailService)iin);
}
return new com.android.emailcommon.service.IEmailService.Stub.Proxy(obj);
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
case TRANSACTION_validate:
{
data.enforceInterface(DESCRIPTOR);
com.android.emailcommon.provider.HostAuth _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.emailcommon.provider.HostAuth.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.os.Bundle _result = this.validate(_arg0);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_startSync:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.startSync(_arg0, _arg1);
return true;
}
case TRANSACTION_stopSync:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.stopSync(_arg0);
return true;
}
case TRANSACTION_loadMore:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.loadMore(_arg0);
return true;
}
case TRANSACTION_loadAttachment:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.loadAttachment(_arg0, _arg1);
return true;
}
case TRANSACTION_updateFolderList:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.updateFolderList(_arg0);
return true;
}
case TRANSACTION_createFolder:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.createFolder(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_deleteFolder:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.deleteFolder(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_renameFolder:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
boolean _result = this.renameFolder(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setCallback:
{
data.enforceInterface(DESCRIPTOR);
com.android.emailcommon.service.IEmailServiceCallback _arg0;
_arg0 = com.android.emailcommon.service.IEmailServiceCallback.Stub.asInterface(data.readStrongBinder());
this.setCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setLogging:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setLogging(_arg0);
return true;
}
case TRANSACTION_hostChanged:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.hostChanged(_arg0);
return true;
}
case TRANSACTION_autoDiscover:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
android.os.Bundle _result = this.autoDiscover(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_sendMeetingResponse:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
this.sendMeetingResponse(_arg0, _arg1);
return true;
}
case TRANSACTION_deleteAccountPIMData:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.deleteAccountPIMData(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getApiLevel:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getApiLevel();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_searchMessages:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
com.android.emailcommon.service.SearchParams _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.emailcommon.service.SearchParams.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
long _arg2;
_arg2 = data.readLong();
int _result = this.searchMessages(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_sendMail:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.sendMail(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.emailcommon.service.IEmailService
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
@Override public android.os.Bundle validate(com.android.emailcommon.provider.HostAuth hostauth) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((hostauth!=null)) {
_data.writeInt(1);
hostauth.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_validate, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void startSync(long mailboxId, boolean userRequest) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(mailboxId);
_data.writeInt(((userRequest)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_startSync, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void stopSync(long mailboxId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(mailboxId);
mRemote.transact(Stub.TRANSACTION_stopSync, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void loadMore(long messageId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(messageId);
mRemote.transact(Stub.TRANSACTION_loadMore, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void loadAttachment(long attachmentId, boolean background) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(attachmentId);
_data.writeInt(((background)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_loadAttachment, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void updateFolderList(long accountId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(accountId);
mRemote.transact(Stub.TRANSACTION_updateFolderList, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public boolean createFolder(long accountId, java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(accountId);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_createFolder, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean deleteFolder(long accountId, java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(accountId);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_deleteFolder, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean renameFolder(long accountId, java.lang.String oldName, java.lang.String newName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(accountId);
_data.writeString(oldName);
_data.writeString(newName);
mRemote.transact(Stub.TRANSACTION_renameFolder, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Must not be oneway; unless an exception is thrown, the caller is guaranteed that the callback
// has been registered

@Override public void setCallback(com.android.emailcommon.service.IEmailServiceCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setLogging(int on) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(on);
mRemote.transact(Stub.TRANSACTION_setLogging, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void hostChanged(long accountId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(accountId);
mRemote.transact(Stub.TRANSACTION_hostChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public android.os.Bundle autoDiscover(java.lang.String userName, java.lang.String password) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(userName);
_data.writeString(password);
mRemote.transact(Stub.TRANSACTION_autoDiscover, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void sendMeetingResponse(long messageId, int response) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(messageId);
_data.writeInt(response);
mRemote.transact(Stub.TRANSACTION_sendMeetingResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Must not be oneway; unless an exception is thrown, the caller is guaranteed that the action
// has been completed

@Override public void deleteAccountPIMData(long accountId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(accountId);
mRemote.transact(Stub.TRANSACTION_deleteAccountPIMData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getApiLevel() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getApiLevel, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// API level 2

@Override public int searchMessages(long accountId, com.android.emailcommon.service.SearchParams params, long destMailboxId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(accountId);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeLong(destMailboxId);
mRemote.transact(Stub.TRANSACTION_searchMessages, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void sendMail(long accountId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(accountId);
mRemote.transact(Stub.TRANSACTION_sendMail, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_validate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_startSync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_stopSync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_loadMore = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_loadAttachment = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_updateFolderList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_createFolder = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_deleteFolder = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_renameFolder = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_setLogging = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_hostChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_autoDiscover = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_sendMeetingResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_deleteAccountPIMData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getApiLevel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_searchMessages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_sendMail = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
}
public android.os.Bundle validate(com.android.emailcommon.provider.HostAuth hostauth) throws android.os.RemoteException;
public void startSync(long mailboxId, boolean userRequest) throws android.os.RemoteException;
public void stopSync(long mailboxId) throws android.os.RemoteException;
public void loadMore(long messageId) throws android.os.RemoteException;
public void loadAttachment(long attachmentId, boolean background) throws android.os.RemoteException;
public void updateFolderList(long accountId) throws android.os.RemoteException;
public boolean createFolder(long accountId, java.lang.String name) throws android.os.RemoteException;
public boolean deleteFolder(long accountId, java.lang.String name) throws android.os.RemoteException;
public boolean renameFolder(long accountId, java.lang.String oldName, java.lang.String newName) throws android.os.RemoteException;
// Must not be oneway; unless an exception is thrown, the caller is guaranteed that the callback
// has been registered

public void setCallback(com.android.emailcommon.service.IEmailServiceCallback cb) throws android.os.RemoteException;
public void setLogging(int on) throws android.os.RemoteException;
public void hostChanged(long accountId) throws android.os.RemoteException;
public android.os.Bundle autoDiscover(java.lang.String userName, java.lang.String password) throws android.os.RemoteException;
public void sendMeetingResponse(long messageId, int response) throws android.os.RemoteException;
// Must not be oneway; unless an exception is thrown, the caller is guaranteed that the action
// has been completed

public void deleteAccountPIMData(long accountId) throws android.os.RemoteException;
public int getApiLevel() throws android.os.RemoteException;
// API level 2

public int searchMessages(long accountId, com.android.emailcommon.service.SearchParams params, long destMailboxId) throws android.os.RemoteException;
public void sendMail(long accountId) throws android.os.RemoteException;
}
