package rockchip.hardware.neuralnetworks.V1_0;

public interface IRKNeuralnetworks extends android.hidl.base.V1_0.IBase {
    /**
     * Fully-qualified interface name for this interface.
     */
    public static final String kInterfaceName = "rockchip.hardware.neuralnetworks@1.0::IRKNeuralnetworks";

    /**
     * Does a checked conversion from a binder to this class.
     */
    /* package private */ static IRKNeuralnetworks asInterface(android.os.IHwBinder binder) {
        if (binder == null) {
            return null;
        }

        android.os.IHwInterface iface =
                binder.queryLocalInterface(kInterfaceName);

        if ((iface != null) && (iface instanceof IRKNeuralnetworks)) {
            return (IRKNeuralnetworks)iface;
        }

        IRKNeuralnetworks proxy = new IRKNeuralnetworks.Proxy(binder);

        try {
            for (String descriptor : proxy.interfaceChain()) {
                if (descriptor.equals(kInterfaceName)) {
                    return proxy;
                }
            }
        } catch (android.os.RemoteException e) {
        }

        return null;
    }

    /**
     * Does a checked conversion from any interface to this class.
     */
    public static IRKNeuralnetworks castFrom(android.os.IHwInterface iface) {
        return (iface == null) ? null : IRKNeuralnetworks.asInterface(iface.asBinder());
    }

    @Override
    public android.os.IHwBinder asBinder();

    /**
     * This will invoke the equivalent of the C++ getService(std::string) if retry is
     * true or tryGetService(std::string) if retry is false. If the service is
     * available on the device and retry is true, this will wait for the service to
     * start. Otherwise, it will return immediately even if the service is null.
     */
    public static IRKNeuralnetworks getService(String serviceName, boolean retry) throws android.os.RemoteException {
        return IRKNeuralnetworks.asInterface(android.os.HwBinder.getService("rockchip.hardware.neuralnetworks@1.0::IRKNeuralnetworks", serviceName, retry));
    }

    /**
     * Calls getService("default",retry).
     */
    public static IRKNeuralnetworks getService(boolean retry) throws android.os.RemoteException {
        return getService("default", retry);
    }

    /**
     * Warning: this will not wait for the interface to come up if it hasn't yet
     * started. See getService(String,boolean) instead.
     */
    public static IRKNeuralnetworks getService(String serviceName) throws android.os.RemoteException {
        return IRKNeuralnetworks.asInterface(android.os.HwBinder.getService("rockchip.hardware.neuralnetworks@1.0::IRKNeuralnetworks", serviceName));
    }

    /**
     * Warning: this will not wait for the interface to come up if it hasn't yet started. See getService(String,boolean) instead.
     */
    public static IRKNeuralnetworks getService() throws android.os.RemoteException {
        return getService("default");
    }


    @java.lang.FunctionalInterface
    public interface rknnInitCallback {
        public void onValues(int status, long context);
    }

    void rknnInit(rockchip.hardware.neuralnetworks.V1_0.RKNNModel model, int size, int flag, rknnInitCallback _hidl_cb)
        throws android.os.RemoteException;

    @java.lang.FunctionalInterface
    public interface rknnInit2Callback {
        public void onValues(int status, long context);
    }

    void rknnInit2(rockchip.hardware.neuralnetworks.V1_0.RKNNModel model, int size, int flag, rockchip.hardware.neuralnetworks.V1_0.RKNNInitExtend extend, rknnInit2Callback _hidl_cb)
        throws android.os.RemoteException;

    @java.lang.FunctionalInterface
    public interface rknnFindDevicesCallback {
        public void onValues(int status, rockchip.hardware.neuralnetworks.V1_0.RKNNDeviceID pdevs);
    }

    void rknnFindDevices(rknnFindDevicesCallback _hidl_cb)
        throws android.os.RemoteException;
    int rknnDestory(long context)
        throws android.os.RemoteException;

    @java.lang.FunctionalInterface
    public interface rknnQueryCallback {
        public void onValues(int status, rockchip.hardware.neuralnetworks.V1_0.RKNNHWBuffer info);
    }

    void rknnQuery(long context, int cmd, int size, rknnQueryCallback _hidl_cb)
        throws android.os.RemoteException;
    int rknnInputsSet(long context, int n_inputs, java.util.ArrayList<rockchip.hardware.neuralnetworks.V1_0.RKNNInput> inputs)
        throws android.os.RemoteException;
    int rknnRun(long context, rockchip.hardware.neuralnetworks.V1_0.RKNNRunExtend extend)
        throws android.os.RemoteException;

    @java.lang.FunctionalInterface
    public interface rknnOutputsGetCallback {
        public void onValues(int status, java.util.ArrayList<rockchip.hardware.neuralnetworks.V1_0.RKNNOutput> outputs);
    }

    void rknnOutputsGet(long context, int n_outputs, rockchip.hardware.neuralnetworks.V1_0.RKNNOutputExtend extend, rknnOutputsGetCallback _hidl_cb)
        throws android.os.RemoteException;
    int rknnOutputsRelease(long context, int n_outputs, java.util.ArrayList<rockchip.hardware.neuralnetworks.V1_0.RKNNOutput> outputs)
        throws android.os.RemoteException;
    void registerCallback(rockchip.hardware.neuralnetworks.V1_0.ILoadModelCallback loadCallback, rockchip.hardware.neuralnetworks.V1_0.IGetResultCallback gotCallback)
        throws android.os.RemoteException;
    /*
     * Provides run-time type information for this object.
     * For example, for the following interface definition:
     *     package android.hardware.foo@1.0;
     *     interface IParent {};
     *     interface IChild extends IParent {};
     * Calling interfaceChain on an IChild object must yield the following:
     *     ["android.hardware.foo@1.0::IChild",
     *      "android.hardware.foo@1.0::IParent"
     *      "android.hidl.base@1.0::IBase"]
     *
     * @return descriptors a vector of descriptors of the run-time type of the
     *         object.
     */
    java.util.ArrayList<String> interfaceChain()
        throws android.os.RemoteException;
    /*
     * Emit diagnostic information to the given file.
     *
     * Optionally overriden.
     *
     * @param fd      File descriptor to dump data to.
     *                Must only be used for the duration of this call.
     * @param options Arguments for debugging.
     *                Must support empty for default debug information.
     */
    void debug(android.os.NativeHandle fd, java.util.ArrayList<String> options)
        throws android.os.RemoteException;
    /*
     * Provides run-time type information for this object.
     * For example, for the following interface definition:
     *     package android.hardware.foo@1.0;
     *     interface IParent {};
     *     interface IChild extends IParent {};
     * Calling interfaceDescriptor on an IChild object must yield
     *     "android.hardware.foo@1.0::IChild"
     *
     * @return descriptor a descriptor of the run-time type of the
     *         object (the first element of the vector returned by
     *         interfaceChain())
     */
    String interfaceDescriptor()
        throws android.os.RemoteException;
    /*
     * Returns hashes of the source HAL files that define the interfaces of the
     * runtime type information on the object.
     * For example, for the following interface definition:
     *     package android.hardware.foo@1.0;
     *     interface IParent {};
     *     interface IChild extends IParent {};
     * Calling interfaceChain on an IChild object must yield the following:
     *     [(hash of IChild.hal),
     *      (hash of IParent.hal)
     *      (hash of IBase.hal)].
     *
     * SHA-256 is used as the hashing algorithm. Each hash has 32 bytes
     * according to SHA-256 standard.
     *
     * @return hashchain a vector of SHA-1 digests
     */
    java.util.ArrayList<byte[/* 32 */]> getHashChain()
        throws android.os.RemoteException;
    /*
     * This method trigger the interface to enable/disable instrumentation based
     * on system property hal.instrumentation.enable.
     */
    void setHALInstrumentation()
        throws android.os.RemoteException;
    /*
     * Registers a death recipient, to be called when the process hosting this
     * interface dies.
     *
     * @param recipient a hidl_death_recipient callback object
     * @param cookie a cookie that must be returned with the callback
     * @return success whether the death recipient was registered successfully.
     */
    boolean linkToDeath(android.os.IHwBinder.DeathRecipient recipient, long cookie)
        throws android.os.RemoteException;
    /*
     * Provides way to determine if interface is running without requesting
     * any functionality.
     */
    void ping()
        throws android.os.RemoteException;
    /*
     * Get debug information on references on this interface.
     * @return info debugging information. See comments of DebugInfo.
     */
    android.hidl.base.V1_0.DebugInfo getDebugInfo()
        throws android.os.RemoteException;
    /*
     * This method notifies the interface that one or more system properties
     * have changed. The default implementation calls
     * (C++)  report_sysprop_change() in libcutils or
     * (Java) android.os.SystemProperties.reportSyspropChanged,
     * which in turn calls a set of registered callbacks (eg to update trace
     * tags).
     */
    void notifySyspropsChanged()
        throws android.os.RemoteException;
    /*
     * Unregisters the registered death recipient. If this service was registered
     * multiple times with the same exact death recipient, this unlinks the most
     * recently registered one.
     *
     * @param recipient a previously registered hidl_death_recipient callback
     * @return success whether the death recipient was unregistered successfully.
     */
    boolean unlinkToDeath(android.os.IHwBinder.DeathRecipient recipient)
        throws android.os.RemoteException;

    public static final class Proxy implements IRKNeuralnetworks {
        private android.os.IHwBinder mRemote;

        public Proxy(android.os.IHwBinder remote) {
            mRemote = java.util.Objects.requireNonNull(remote);
        }

        @Override
        public android.os.IHwBinder asBinder() {
            return mRemote;
        }

        @Override
        public String toString() {
            try {
                return this.interfaceDescriptor() + "@Proxy";
            } catch (android.os.RemoteException ex) {
                /* ignored; handled below. */
            }
            return "[class or subclass of " + IRKNeuralnetworks.kInterfaceName + "]@Proxy";
        }

        @Override
        public final boolean equals(java.lang.Object other) {
            return android.os.HidlSupport.interfacesEqual(this, other);
        }

        @Override
        public final int hashCode() {
            return this.asBinder().hashCode();
        }

        // Methods from ::rockchip::hardware::neuralnetworks::V1_0::IRKNeuralnetworks follow.
        @Override
        public void rknnInit(rockchip.hardware.neuralnetworks.V1_0.RKNNModel model, int size, int flag, rknnInitCallback _hidl_cb)
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(rockchip.hardware.neuralnetworks.V1_0.IRKNeuralnetworks.kInterfaceName);
            ((rockchip.hardware.neuralnetworks.V1_0.RKNNModel) model).writeToParcel(_hidl_request);
            _hidl_request.writeInt32(size);
            _hidl_request.writeInt32(flag);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(1 /* rknnInit */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                int _hidl_out_status = _hidl_reply.readInt32();
                long _hidl_out_context = _hidl_reply.readInt64();
                _hidl_cb.onValues(_hidl_out_status, _hidl_out_context);
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public void rknnInit2(rockchip.hardware.neuralnetworks.V1_0.RKNNModel model, int size, int flag, rockchip.hardware.neuralnetworks.V1_0.RKNNInitExtend extend, rknnInit2Callback _hidl_cb)
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(rockchip.hardware.neuralnetworks.V1_0.IRKNeuralnetworks.kInterfaceName);
            ((rockchip.hardware.neuralnetworks.V1_0.RKNNModel) model).writeToParcel(_hidl_request);
            _hidl_request.writeInt32(size);
            _hidl_request.writeInt32(flag);
            ((rockchip.hardware.neuralnetworks.V1_0.RKNNInitExtend) extend).writeToParcel(_hidl_request);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(2 /* rknnInit2 */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                int _hidl_out_status = _hidl_reply.readInt32();
                long _hidl_out_context = _hidl_reply.readInt64();
                _hidl_cb.onValues(_hidl_out_status, _hidl_out_context);
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public void rknnFindDevices(rknnFindDevicesCallback _hidl_cb)
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(rockchip.hardware.neuralnetworks.V1_0.IRKNeuralnetworks.kInterfaceName);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(3 /* rknnFindDevices */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                int _hidl_out_status = _hidl_reply.readInt32();
                rockchip.hardware.neuralnetworks.V1_0.RKNNDeviceID _hidl_out_pdevs = new rockchip.hardware.neuralnetworks.V1_0.RKNNDeviceID();
                ((rockchip.hardware.neuralnetworks.V1_0.RKNNDeviceID) _hidl_out_pdevs).readFromParcel(_hidl_reply);
                _hidl_cb.onValues(_hidl_out_status, _hidl_out_pdevs);
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public int rknnDestory(long context)
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(rockchip.hardware.neuralnetworks.V1_0.IRKNeuralnetworks.kInterfaceName);
            _hidl_request.writeInt64(context);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(4 /* rknnDestory */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                int _hidl_out_status = _hidl_reply.readInt32();
                return _hidl_out_status;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public void rknnQuery(long context, int cmd, int size, rknnQueryCallback _hidl_cb)
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(rockchip.hardware.neuralnetworks.V1_0.IRKNeuralnetworks.kInterfaceName);
            _hidl_request.writeInt64(context);
            _hidl_request.writeInt32(cmd);
            _hidl_request.writeInt32(size);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(5 /* rknnQuery */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                int _hidl_out_status = _hidl_reply.readInt32();
                rockchip.hardware.neuralnetworks.V1_0.RKNNHWBuffer _hidl_out_info = new rockchip.hardware.neuralnetworks.V1_0.RKNNHWBuffer();
                ((rockchip.hardware.neuralnetworks.V1_0.RKNNHWBuffer) _hidl_out_info).readFromParcel(_hidl_reply);
                _hidl_cb.onValues(_hidl_out_status, _hidl_out_info);
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public int rknnInputsSet(long context, int n_inputs, java.util.ArrayList<rockchip.hardware.neuralnetworks.V1_0.RKNNInput> inputs)
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(rockchip.hardware.neuralnetworks.V1_0.IRKNeuralnetworks.kInterfaceName);
            _hidl_request.writeInt64(context);
            _hidl_request.writeInt32(n_inputs);
            rockchip.hardware.neuralnetworks.V1_0.RKNNInput.writeVectorToParcel(_hidl_request, inputs);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(6 /* rknnInputsSet */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                int _hidl_out_status = _hidl_reply.readInt32();
                return _hidl_out_status;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public int rknnRun(long context, rockchip.hardware.neuralnetworks.V1_0.RKNNRunExtend extend)
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(rockchip.hardware.neuralnetworks.V1_0.IRKNeuralnetworks.kInterfaceName);
            _hidl_request.writeInt64(context);
            ((rockchip.hardware.neuralnetworks.V1_0.RKNNRunExtend) extend).writeToParcel(_hidl_request);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(7 /* rknnRun */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                int _hidl_out_status = _hidl_reply.readInt32();
                return _hidl_out_status;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public void rknnOutputsGet(long context, int n_outputs, rockchip.hardware.neuralnetworks.V1_0.RKNNOutputExtend extend, rknnOutputsGetCallback _hidl_cb)
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(rockchip.hardware.neuralnetworks.V1_0.IRKNeuralnetworks.kInterfaceName);
            _hidl_request.writeInt64(context);
            _hidl_request.writeInt32(n_outputs);
            ((rockchip.hardware.neuralnetworks.V1_0.RKNNOutputExtend) extend).writeToParcel(_hidl_request);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(8 /* rknnOutputsGet */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                int _hidl_out_status = _hidl_reply.readInt32();
                java.util.ArrayList<rockchip.hardware.neuralnetworks.V1_0.RKNNOutput> _hidl_out_outputs = rockchip.hardware.neuralnetworks.V1_0.RKNNOutput.readVectorFromParcel(_hidl_reply);
                _hidl_cb.onValues(_hidl_out_status, _hidl_out_outputs);
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public int rknnOutputsRelease(long context, int n_outputs, java.util.ArrayList<rockchip.hardware.neuralnetworks.V1_0.RKNNOutput> outputs)
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(rockchip.hardware.neuralnetworks.V1_0.IRKNeuralnetworks.kInterfaceName);
            _hidl_request.writeInt64(context);
            _hidl_request.writeInt32(n_outputs);
            rockchip.hardware.neuralnetworks.V1_0.RKNNOutput.writeVectorToParcel(_hidl_request, outputs);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(9 /* rknnOutputsRelease */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                int _hidl_out_status = _hidl_reply.readInt32();
                return _hidl_out_status;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public void registerCallback(rockchip.hardware.neuralnetworks.V1_0.ILoadModelCallback loadCallback, rockchip.hardware.neuralnetworks.V1_0.IGetResultCallback gotCallback)
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(rockchip.hardware.neuralnetworks.V1_0.IRKNeuralnetworks.kInterfaceName);
            _hidl_request.writeStrongBinder(loadCallback == null ? null : loadCallback.asBinder());
            _hidl_request.writeStrongBinder(gotCallback == null ? null : gotCallback.asBinder());

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(10 /* registerCallback */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        // Methods from ::android::hidl::base::V1_0::IBase follow.
        @Override
        public java.util.ArrayList<String> interfaceChain()
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(android.hidl.base.V1_0.IBase.kInterfaceName);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(256067662 /* interfaceChain */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                java.util.ArrayList<String> _hidl_out_descriptors = _hidl_reply.readStringVector();
                return _hidl_out_descriptors;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public void debug(android.os.NativeHandle fd, java.util.ArrayList<String> options)
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(android.hidl.base.V1_0.IBase.kInterfaceName);
            _hidl_request.writeNativeHandle(fd);
            _hidl_request.writeStringVector(options);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(256131655 /* debug */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public String interfaceDescriptor()
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(android.hidl.base.V1_0.IBase.kInterfaceName);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(256136003 /* interfaceDescriptor */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                String _hidl_out_descriptor = _hidl_reply.readString();
                return _hidl_out_descriptor;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public java.util.ArrayList<byte[/* 32 */]> getHashChain()
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(android.hidl.base.V1_0.IBase.kInterfaceName);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(256398152 /* getHashChain */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                java.util.ArrayList<byte[/* 32 */]> _hidl_out_hashchain =  new java.util.ArrayList<byte[/* 32 */]>();
                {
                    android.os.HwBlob _hidl_blob = _hidl_reply.readBuffer(16 /* size */);
                    {
                        int _hidl_vec_size = _hidl_blob.getInt32(0 /* offset */ + 8 /* offsetof(hidl_vec<T>, mSize) */);
                        android.os.HwBlob childBlob = _hidl_reply.readEmbeddedBuffer(
                                _hidl_vec_size * 32,_hidl_blob.handle(),
                                0 /* offset */ + 0 /* offsetof(hidl_vec<T>, mBuffer) */,true /* nullable */);

                        ((java.util.ArrayList<byte[/* 32 */]>) _hidl_out_hashchain).clear();
                        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                            byte[/* 32 */] _hidl_vec_element = new byte[32];
                            {
                                long _hidl_array_offset_1 = _hidl_index_0 * 32;
                                childBlob.copyToInt8Array(_hidl_array_offset_1, (byte[/* 32 */]) _hidl_vec_element, 32 /* size */);
                                _hidl_array_offset_1 += 32 * 1;
                            }
                            ((java.util.ArrayList<byte[/* 32 */]>) _hidl_out_hashchain).add(_hidl_vec_element);
                        }
                    }
                }
                return _hidl_out_hashchain;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public void setHALInstrumentation()
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(android.hidl.base.V1_0.IBase.kInterfaceName);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(256462420 /* setHALInstrumentation */, _hidl_request, _hidl_reply, 1 /* oneway */);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public boolean linkToDeath(android.os.IHwBinder.DeathRecipient recipient, long cookie)
                throws android.os.RemoteException {
            return mRemote.linkToDeath(recipient, cookie);
        }
        @Override
        public void ping()
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(android.hidl.base.V1_0.IBase.kInterfaceName);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(256921159 /* ping */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public android.hidl.base.V1_0.DebugInfo getDebugInfo()
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(android.hidl.base.V1_0.IBase.kInterfaceName);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(257049926 /* getDebugInfo */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                android.hidl.base.V1_0.DebugInfo _hidl_out_info = new android.hidl.base.V1_0.DebugInfo();
                ((android.hidl.base.V1_0.DebugInfo) _hidl_out_info).readFromParcel(_hidl_reply);
                return _hidl_out_info;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public void notifySyspropsChanged()
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(android.hidl.base.V1_0.IBase.kInterfaceName);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(257120595 /* notifySyspropsChanged */, _hidl_request, _hidl_reply, 1 /* oneway */);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public boolean unlinkToDeath(android.os.IHwBinder.DeathRecipient recipient)
                throws android.os.RemoteException {
            return mRemote.unlinkToDeath(recipient);
        }
    }

    public static abstract class Stub extends android.os.HwBinder implements IRKNeuralnetworks {
        @Override
        public android.os.IHwBinder asBinder() {
            return this;
        }

        @Override
        public final java.util.ArrayList<String> interfaceChain() {
            return new java.util.ArrayList<String>(java.util.Arrays.asList(
                    rockchip.hardware.neuralnetworks.V1_0.IRKNeuralnetworks.kInterfaceName,
                    android.hidl.base.V1_0.IBase.kInterfaceName));

        }

        @Override
        public void debug(android.os.NativeHandle fd, java.util.ArrayList<String> options) {
            return;

        }

        @Override
        public final String interfaceDescriptor() {
            return rockchip.hardware.neuralnetworks.V1_0.IRKNeuralnetworks.kInterfaceName;

        }

        @Override
        public final java.util.ArrayList<byte[/* 32 */]> getHashChain() {
            return new java.util.ArrayList<byte[/* 32 */]>(java.util.Arrays.asList(
                    new byte[/* 32 */]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} /* 0000000000000000000000000000000000000000000000000000000000000000 */,
                    new byte[/* 32 */]{-20,127,-41,-98,-48,45,-6,-123,-68,73,-108,38,-83,-82,62,-66,35,-17,5,36,-13,-51,105,87,19,-109,36,-72,59,24,-54,76} /* ec7fd79ed02dfa85bc499426adae3ebe23ef0524f3cd6957139324b83b18ca4c */));

        }

        @Override
        public final void setHALInstrumentation() {

        }

        @Override
        public final boolean linkToDeath(android.os.IHwBinder.DeathRecipient recipient, long cookie) {
            return true;

        }

        @Override
        public final void ping() {
            return;

        }

        @Override
        public final android.hidl.base.V1_0.DebugInfo getDebugInfo() {
            android.hidl.base.V1_0.DebugInfo info = new android.hidl.base.V1_0.DebugInfo();
            info.pid = android.os.HidlSupport.getPidIfSharable();
            info.ptr = 0;
            info.arch = android.hidl.base.V1_0.DebugInfo.Architecture.UNKNOWN;
            return info;

        }

        @Override
        public final void notifySyspropsChanged() {
            android.os.HwBinder.enableInstrumentation();

        }

        @Override
        public final boolean unlinkToDeath(android.os.IHwBinder.DeathRecipient recipient) {
            return true;

        }

        @Override
        public android.os.IHwInterface queryLocalInterface(String descriptor) {
            if (kInterfaceName.equals(descriptor)) {
                return this;
            }
            return null;
        }

        public void registerAsService(String serviceName) throws android.os.RemoteException {
            registerService(serviceName);
        }

        @Override
        public String toString() {
            return this.interfaceDescriptor() + "@Stub";
        }

        @Override
        public void onTransact(int _hidl_code, android.os.HwParcel _hidl_request, final android.os.HwParcel _hidl_reply, int _hidl_flags)
                throws android.os.RemoteException {
            switch (_hidl_code) {
                case 1 /* rknnInit */:
                {
                    _hidl_request.enforceInterface(rockchip.hardware.neuralnetworks.V1_0.IRKNeuralnetworks.kInterfaceName);

                    rockchip.hardware.neuralnetworks.V1_0.RKNNModel model = new rockchip.hardware.neuralnetworks.V1_0.RKNNModel();
                    ((rockchip.hardware.neuralnetworks.V1_0.RKNNModel) model).readFromParcel(_hidl_request);
                    int size = _hidl_request.readInt32();
                    int flag = _hidl_request.readInt32();
                    rknnInit(model, size, flag, new rknnInitCallback() {
                        @Override
                        public void onValues(int status, long context) {
                            _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                            _hidl_reply.writeInt32(status);
                            _hidl_reply.writeInt64(context);
                            _hidl_reply.send();
                            }});
                    break;
                }

                case 2 /* rknnInit2 */:
                {
                    _hidl_request.enforceInterface(rockchip.hardware.neuralnetworks.V1_0.IRKNeuralnetworks.kInterfaceName);

                    rockchip.hardware.neuralnetworks.V1_0.RKNNModel model = new rockchip.hardware.neuralnetworks.V1_0.RKNNModel();
                    ((rockchip.hardware.neuralnetworks.V1_0.RKNNModel) model).readFromParcel(_hidl_request);
                    int size = _hidl_request.readInt32();
                    int flag = _hidl_request.readInt32();
                    rockchip.hardware.neuralnetworks.V1_0.RKNNInitExtend extend = new rockchip.hardware.neuralnetworks.V1_0.RKNNInitExtend();
                    ((rockchip.hardware.neuralnetworks.V1_0.RKNNInitExtend) extend).readFromParcel(_hidl_request);
                    rknnInit2(model, size, flag, extend, new rknnInit2Callback() {
                        @Override
                        public void onValues(int status, long context) {
                            _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                            _hidl_reply.writeInt32(status);
                            _hidl_reply.writeInt64(context);
                            _hidl_reply.send();
                            }});
                    break;
                }

                case 3 /* rknnFindDevices */:
                {
                    _hidl_request.enforceInterface(rockchip.hardware.neuralnetworks.V1_0.IRKNeuralnetworks.kInterfaceName);

                    rknnFindDevices(new rknnFindDevicesCallback() {
                        @Override
                        public void onValues(int status, rockchip.hardware.neuralnetworks.V1_0.RKNNDeviceID pdevs) {
                            _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                            _hidl_reply.writeInt32(status);
                            ((rockchip.hardware.neuralnetworks.V1_0.RKNNDeviceID) pdevs).writeToParcel(_hidl_reply);
                            _hidl_reply.send();
                            }});
                    break;
                }

                case 4 /* rknnDestory */:
                {
                    _hidl_request.enforceInterface(rockchip.hardware.neuralnetworks.V1_0.IRKNeuralnetworks.kInterfaceName);

                    long context = _hidl_request.readInt64();
                    int _hidl_out_status = rknnDestory(context);
                    _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                    _hidl_reply.writeInt32(_hidl_out_status);
                    _hidl_reply.send();
                    break;
                }

                case 5 /* rknnQuery */:
                {
                    _hidl_request.enforceInterface(rockchip.hardware.neuralnetworks.V1_0.IRKNeuralnetworks.kInterfaceName);

                    long context = _hidl_request.readInt64();
                    int cmd = _hidl_request.readInt32();
                    int size = _hidl_request.readInt32();
                    rknnQuery(context, cmd, size, new rknnQueryCallback() {
                        @Override
                        public void onValues(int status, rockchip.hardware.neuralnetworks.V1_0.RKNNHWBuffer info) {
                            _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                            _hidl_reply.writeInt32(status);
                            ((rockchip.hardware.neuralnetworks.V1_0.RKNNHWBuffer) info).writeToParcel(_hidl_reply);
                            _hidl_reply.send();
                            }});
                    break;
                }

                case 6 /* rknnInputsSet */:
                {
                    _hidl_request.enforceInterface(rockchip.hardware.neuralnetworks.V1_0.IRKNeuralnetworks.kInterfaceName);

                    long context = _hidl_request.readInt64();
                    int n_inputs = _hidl_request.readInt32();
                    java.util.ArrayList<rockchip.hardware.neuralnetworks.V1_0.RKNNInput> inputs = rockchip.hardware.neuralnetworks.V1_0.RKNNInput.readVectorFromParcel(_hidl_request);
                    int _hidl_out_status = rknnInputsSet(context, n_inputs, inputs);
                    _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                    _hidl_reply.writeInt32(_hidl_out_status);
                    _hidl_reply.send();
                    break;
                }

                case 7 /* rknnRun */:
                {
                    _hidl_request.enforceInterface(rockchip.hardware.neuralnetworks.V1_0.IRKNeuralnetworks.kInterfaceName);

                    long context = _hidl_request.readInt64();
                    rockchip.hardware.neuralnetworks.V1_0.RKNNRunExtend extend = new rockchip.hardware.neuralnetworks.V1_0.RKNNRunExtend();
                    ((rockchip.hardware.neuralnetworks.V1_0.RKNNRunExtend) extend).readFromParcel(_hidl_request);
                    int _hidl_out_status = rknnRun(context, extend);
                    _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                    _hidl_reply.writeInt32(_hidl_out_status);
                    _hidl_reply.send();
                    break;
                }

                case 8 /* rknnOutputsGet */:
                {
                    _hidl_request.enforceInterface(rockchip.hardware.neuralnetworks.V1_0.IRKNeuralnetworks.kInterfaceName);

                    long context = _hidl_request.readInt64();
                    int n_outputs = _hidl_request.readInt32();
                    rockchip.hardware.neuralnetworks.V1_0.RKNNOutputExtend extend = new rockchip.hardware.neuralnetworks.V1_0.RKNNOutputExtend();
                    ((rockchip.hardware.neuralnetworks.V1_0.RKNNOutputExtend) extend).readFromParcel(_hidl_request);
                    rknnOutputsGet(context, n_outputs, extend, new rknnOutputsGetCallback() {
                        @Override
                        public void onValues(int status, java.util.ArrayList<rockchip.hardware.neuralnetworks.V1_0.RKNNOutput> outputs) {
                            _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                            _hidl_reply.writeInt32(status);
                            rockchip.hardware.neuralnetworks.V1_0.RKNNOutput.writeVectorToParcel(_hidl_reply, outputs);
                            _hidl_reply.send();
                            }});
                    break;
                }

                case 9 /* rknnOutputsRelease */:
                {
                    _hidl_request.enforceInterface(rockchip.hardware.neuralnetworks.V1_0.IRKNeuralnetworks.kInterfaceName);

                    long context = _hidl_request.readInt64();
                    int n_outputs = _hidl_request.readInt32();
                    java.util.ArrayList<rockchip.hardware.neuralnetworks.V1_0.RKNNOutput> outputs = rockchip.hardware.neuralnetworks.V1_0.RKNNOutput.readVectorFromParcel(_hidl_request);
                    int _hidl_out_status = rknnOutputsRelease(context, n_outputs, outputs);
                    _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                    _hidl_reply.writeInt32(_hidl_out_status);
                    _hidl_reply.send();
                    break;
                }

                case 10 /* registerCallback */:
                {
                    _hidl_request.enforceInterface(rockchip.hardware.neuralnetworks.V1_0.IRKNeuralnetworks.kInterfaceName);

                    rockchip.hardware.neuralnetworks.V1_0.ILoadModelCallback loadCallback = rockchip.hardware.neuralnetworks.V1_0.ILoadModelCallback.asInterface(_hidl_request.readStrongBinder());
                    rockchip.hardware.neuralnetworks.V1_0.IGetResultCallback gotCallback = rockchip.hardware.neuralnetworks.V1_0.IGetResultCallback.asInterface(_hidl_request.readStrongBinder());
                    registerCallback(loadCallback, gotCallback);
                    _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                    _hidl_reply.send();
                    break;
                }

                case 256067662 /* interfaceChain */:
                {
                    _hidl_request.enforceInterface(android.hidl.base.V1_0.IBase.kInterfaceName);

                    java.util.ArrayList<String> _hidl_out_descriptors = interfaceChain();
                    _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                    _hidl_reply.writeStringVector(_hidl_out_descriptors);
                    _hidl_reply.send();
                    break;
                }

                case 256131655 /* debug */:
                {
                    _hidl_request.enforceInterface(android.hidl.base.V1_0.IBase.kInterfaceName);

                    android.os.NativeHandle fd = _hidl_request.readNativeHandle();
                    java.util.ArrayList<String> options = _hidl_request.readStringVector();
                    debug(fd, options);
                    _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                    _hidl_reply.send();
                    break;
                }

                case 256136003 /* interfaceDescriptor */:
                {
                    _hidl_request.enforceInterface(android.hidl.base.V1_0.IBase.kInterfaceName);

                    String _hidl_out_descriptor = interfaceDescriptor();
                    _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                    _hidl_reply.writeString(_hidl_out_descriptor);
                    _hidl_reply.send();
                    break;
                }

                case 256398152 /* getHashChain */:
                {
                    _hidl_request.enforceInterface(android.hidl.base.V1_0.IBase.kInterfaceName);

                    java.util.ArrayList<byte[/* 32 */]> _hidl_out_hashchain = getHashChain();
                    _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                    {
                        android.os.HwBlob _hidl_blob = new android.os.HwBlob(16 /* size */);
                        {
                            int _hidl_vec_size = _hidl_out_hashchain.size();
                            _hidl_blob.putInt32(0 /* offset */ + 8 /* offsetof(hidl_vec<T>, mSize) */, _hidl_vec_size);
                            _hidl_blob.putBool(0 /* offset */ + 12 /* offsetof(hidl_vec<T>, mOwnsBuffer) */, false);
                            android.os.HwBlob childBlob = new android.os.HwBlob((int)(_hidl_vec_size * 32));
                            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                                {
                                    long _hidl_array_offset_1 = _hidl_index_0 * 32;
                                    byte[] _hidl_array_item_1 = (byte[/* 32 */]) _hidl_out_hashchain.get(_hidl_index_0);

                                    if (_hidl_array_item_1 == null || _hidl_array_item_1.length != 32) {
                                        throw new IllegalArgumentException("Array element is not of the expected length");
                                    }

                                    childBlob.putInt8Array(_hidl_array_offset_1, _hidl_array_item_1);
                                    _hidl_array_offset_1 += 32 * 1;
                                }
                            }
                            _hidl_blob.putBlob(0 /* offset */ + 0 /* offsetof(hidl_vec<T>, mBuffer) */, childBlob);
                        }
                        _hidl_reply.writeBuffer(_hidl_blob);
                    }
                    _hidl_reply.send();
                    break;
                }

                case 256462420 /* setHALInstrumentation */:
                {
                    _hidl_request.enforceInterface(android.hidl.base.V1_0.IBase.kInterfaceName);

                    setHALInstrumentation();
                    break;
                }

                case 256660548 /* linkToDeath */:
                {
                break;
                }

                case 256921159 /* ping */:
                {
                    _hidl_request.enforceInterface(android.hidl.base.V1_0.IBase.kInterfaceName);

                    ping();
                    _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                    _hidl_reply.send();
                    break;
                }

                case 257049926 /* getDebugInfo */:
                {
                    _hidl_request.enforceInterface(android.hidl.base.V1_0.IBase.kInterfaceName);

                    android.hidl.base.V1_0.DebugInfo _hidl_out_info = getDebugInfo();
                    _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                    ((android.hidl.base.V1_0.DebugInfo) _hidl_out_info).writeToParcel(_hidl_reply);
                    _hidl_reply.send();
                    break;
                }

                case 257120595 /* notifySyspropsChanged */:
                {
                    _hidl_request.enforceInterface(android.hidl.base.V1_0.IBase.kInterfaceName);

                    notifySyspropsChanged();
                    break;
                }

                case 257250372 /* unlinkToDeath */:
                {
                break;
                }

            }
        }
    }
}
