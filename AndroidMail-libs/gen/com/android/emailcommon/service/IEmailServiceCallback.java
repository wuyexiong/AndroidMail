/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/wuyexiong/Desktop/AndroidMail/AndroidMail-libs/src/com/android/emailcommon/service/IEmailServiceCallback.aidl
 */
package com.android.emailcommon.service;
public interface IEmailServiceCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.emailcommon.service.IEmailServiceCallback
{
private static final java.lang.String DESCRIPTOR = "com.android.emailcommon.service.IEmailServiceCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.emailcommon.service.IEmailServiceCallback interface,
 * generating a proxy if needed.
 */
public static com.android.emailcommon.service.IEmailServiceCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.emailcommon.service.IEmailServiceCallback))) {
return ((com.android.emailcommon.service.IEmailServiceCallback)iin);
}
return new com.android.emailcommon.service.IEmailServiceCallback.Stub.Proxy(obj);
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
case TRANSACTION_syncMailboxListStatus:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.syncMailboxListStatus(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_syncMailboxStatus:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.syncMailboxStatus(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_loadAttachmentStatus:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
long _arg1;
_arg1 = data.readLong();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.loadAttachmentStatus(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_sendMessageStatus:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.sendMessageStatus(_arg0, _arg1, _arg2, _arg3);
return true;
}
case TRANSACTION_loadMessageStatus:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.loadMessageStatus(_arg0, _arg1, _arg2);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.emailcommon.service.IEmailServiceCallback
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
/*
     * Ordinary results:
     *   statuscode = 1, progress = 0:      "starting"
     *   statuscode = 0, progress = n/a:    "finished"
     *
     * If there is an error, it must be reported as follows:
     *   statuscode = err, progress = n/a:  "stopping due to error"
     *
     * *Optionally* a callback can also include intermediate values from 1..99 e.g.
     *   statuscode = 1, progress = 0:      "starting"
     *   statuscode = 1, progress = 30:     "working"
     *   statuscode = 1, progress = 60:     "working"
     *   statuscode = 0, progress = n/a:    "finished"
     *//**
     * Callback to indicate that an account is being synced (updating folder list)
     * accountId = the account being synced
     * statusCode = 0 for OK, 1 for progress, other codes for error
     * progress = 0 for "start", 1..100 for optional progress reports
     */
@Override public void syncMailboxListStatus(long accountId, int statusCode, int progress) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(accountId);
_data.writeInt(statusCode);
_data.writeInt(progress);
mRemote.transact(Stub.TRANSACTION_syncMailboxListStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Callback to indicate that a mailbox is being synced
     * mailboxId = the mailbox being synced
     * statusCode = 0 for OK, 1 for progress, other codes for error
     * progress = 0 for "start", 1..100 for optional progress reports
     */
@Override public void syncMailboxStatus(long mailboxId, int statusCode, int progress) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(mailboxId);
_data.writeInt(statusCode);
_data.writeInt(progress);
mRemote.transact(Stub.TRANSACTION_syncMailboxStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Callback to indicate that a particular attachment is being synced
     * messageId = the message that owns the attachment
     * attachmentId = the attachment being synced
     * statusCode = 0 for OK, 1 for progress, other codes for error
     * progress = 0 for "start", 1..100 for optional progress reports
     */
@Override public void loadAttachmentStatus(long messageId, long attachmentId, int statusCode, int progress) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(messageId);
_data.writeLong(attachmentId);
_data.writeInt(statusCode);
_data.writeInt(progress);
mRemote.transact(Stub.TRANSACTION_loadAttachmentStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Callback to indicate that a particular message is being sent
     * messageId = the message being sent
     * statusCode = 0 for OK, 1 for progress, other codes for error
     * progress = 0 for "start", 1..100 for optional progress reports
     */
@Override public void sendMessageStatus(long messageId, java.lang.String subject, int statusCode, int progress) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(messageId);
_data.writeString(subject);
_data.writeInt(statusCode);
_data.writeInt(progress);
mRemote.transact(Stub.TRANSACTION_sendMessageStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Callback to indicate that a particular message is being loaded
     * messageId = the message being sent
     * statusCode = 0 for OK, 1 for progress, other codes for error
     * progress = 0 for "start", 1..100 for optional progress reports
     */
@Override public void loadMessageStatus(long messageId, int statusCode, int progress) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(messageId);
_data.writeInt(statusCode);
_data.writeInt(progress);
mRemote.transact(Stub.TRANSACTION_loadMessageStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_syncMailboxListStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_syncMailboxStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_loadAttachmentStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_sendMessageStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_loadMessageStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
/*
     * Ordinary results:
     *   statuscode = 1, progress = 0:      "starting"
     *   statuscode = 0, progress = n/a:    "finished"
     *
     * If there is an error, it must be reported as follows:
     *   statuscode = err, progress = n/a:  "stopping due to error"
     *
     * *Optionally* a callback can also include intermediate values from 1..99 e.g.
     *   statuscode = 1, progress = 0:      "starting"
     *   statuscode = 1, progress = 30:     "working"
     *   statuscode = 1, progress = 60:     "working"
     *   statuscode = 0, progress = n/a:    "finished"
     *//**
     * Callback to indicate that an account is being synced (updating folder list)
     * accountId = the account being synced
     * statusCode = 0 for OK, 1 for progress, other codes for error
     * progress = 0 for "start", 1..100 for optional progress reports
     */
public void syncMailboxListStatus(long accountId, int statusCode, int progress) throws android.os.RemoteException;
/**
     * Callback to indicate that a mailbox is being synced
     * mailboxId = the mailbox being synced
     * statusCode = 0 for OK, 1 for progress, other codes for error
     * progress = 0 for "start", 1..100 for optional progress reports
     */
public void syncMailboxStatus(long mailboxId, int statusCode, int progress) throws android.os.RemoteException;
/**
     * Callback to indicate that a particular attachment is being synced
     * messageId = the message that owns the attachment
     * attachmentId = the attachment being synced
     * statusCode = 0 for OK, 1 for progress, other codes for error
     * progress = 0 for "start", 1..100 for optional progress reports
     */
public void loadAttachmentStatus(long messageId, long attachmentId, int statusCode, int progress) throws android.os.RemoteException;
/**
     * Callback to indicate that a particular message is being sent
     * messageId = the message being sent
     * statusCode = 0 for OK, 1 for progress, other codes for error
     * progress = 0 for "start", 1..100 for optional progress reports
     */
public void sendMessageStatus(long messageId, java.lang.String subject, int statusCode, int progress) throws android.os.RemoteException;
/**
     * Callback to indicate that a particular message is being loaded
     * messageId = the message being sent
     * statusCode = 0 for OK, 1 for progress, other codes for error
     * progress = 0 for "start", 1..100 for optional progress reports
     */
public void loadMessageStatus(long messageId, int statusCode, int progress) throws android.os.RemoteException;
}
