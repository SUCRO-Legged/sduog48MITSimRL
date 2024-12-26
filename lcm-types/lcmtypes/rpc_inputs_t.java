/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 * lcm-gen 1.5.0
 */

package lcmtypes;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class rpc_inputs_t implements lcm.lcm.LCMEncodable
{
    /**
     * LCM Type: double[12]
     */
    public double current_state[];

    /**
     * LCM Type: double[12]
     */
    public double p_foot0[];

    /**
     * LCM Type: double[12]
     */
    public double r_hip[];

    /**
     * LCM Type: double[72]
     */
    public double x_desired[];

    /**
     * LCM Type: double[4]
     */
    public double gait_enabled[];

    /**
     * LCM Type: double[4]
     */
    public double phase_variable[];

    /**
     * LCM Type: double[4]
     */
    public double period_time[];

    /**
     * LCM Type: double[4]
     */
    public double time_swing[];

    public double mass;

    /**
     * LCM Type: double[3]
     */
    public double inertia[];

    /**
     * LCM Type: double[3]
     */
    public double gravity[];

    /**
     * LCM Type: double[4]
     */
    public double mu[];

    /**
     * LCM Type: double[4]
     */
    public double z_g[];

    /**
     * LCM Type: double[12]
     */
    public double Q[];

    /**
     * LCM Type: double[24]
     */
    public double R[];

    /**
     * LCM Type: double[30]
     */
    public double K_HX[];

 
    public rpc_inputs_t()
    {
        current_state = new double[12];
        p_foot0 = new double[12];
        r_hip = new double[12];
        x_desired = new double[72];
        gait_enabled = new double[4];
        phase_variable = new double[4];
        period_time = new double[4];
        time_swing = new double[4];
        inertia = new double[3];
        gravity = new double[3];
        mu = new double[4];
        z_g = new double[4];
        Q = new double[12];
        R = new double[24];
        K_HX = new double[30];
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0x139d9ad50b349131L;
 
    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(lcmtypes.rpc_inputs_t.class))
            return 0L;
 
        classes.add(lcmtypes.rpc_inputs_t.class);
        long hash = LCM_FINGERPRINT_BASE
            ;
        classes.remove(classes.size() - 1);
        return (hash<<1) + ((hash>>63)&1);
    }
 
    public void encode(DataOutput outs) throws IOException
    {
        outs.writeLong(LCM_FINGERPRINT);
        _encodeRecursive(outs);
    }
 
    public void _encodeRecursive(DataOutput outs) throws IOException
    {
        for (int a = 0; a < 12; a++) {
            outs.writeDouble(this.current_state[a]); 
        }
 
        for (int a = 0; a < 12; a++) {
            outs.writeDouble(this.p_foot0[a]); 
        }
 
        for (int a = 0; a < 12; a++) {
            outs.writeDouble(this.r_hip[a]); 
        }
 
        for (int a = 0; a < 72; a++) {
            outs.writeDouble(this.x_desired[a]); 
        }
 
        for (int a = 0; a < 4; a++) {
            outs.writeDouble(this.gait_enabled[a]); 
        }
 
        for (int a = 0; a < 4; a++) {
            outs.writeDouble(this.phase_variable[a]); 
        }
 
        for (int a = 0; a < 4; a++) {
            outs.writeDouble(this.period_time[a]); 
        }
 
        for (int a = 0; a < 4; a++) {
            outs.writeDouble(this.time_swing[a]); 
        }
 
        outs.writeDouble(this.mass); 
 
        for (int a = 0; a < 3; a++) {
            outs.writeDouble(this.inertia[a]); 
        }
 
        for (int a = 0; a < 3; a++) {
            outs.writeDouble(this.gravity[a]); 
        }
 
        for (int a = 0; a < 4; a++) {
            outs.writeDouble(this.mu[a]); 
        }
 
        for (int a = 0; a < 4; a++) {
            outs.writeDouble(this.z_g[a]); 
        }
 
        for (int a = 0; a < 12; a++) {
            outs.writeDouble(this.Q[a]); 
        }
 
        for (int a = 0; a < 24; a++) {
            outs.writeDouble(this.R[a]); 
        }
 
        for (int a = 0; a < 30; a++) {
            outs.writeDouble(this.K_HX[a]); 
        }
 
    }
 
    public rpc_inputs_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public rpc_inputs_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static lcmtypes.rpc_inputs_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        lcmtypes.rpc_inputs_t o = new lcmtypes.rpc_inputs_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.current_state = new double[(int) 12];
        for (int a = 0; a < 12; a++) {
            this.current_state[a] = ins.readDouble();
        }
 
        this.p_foot0 = new double[(int) 12];
        for (int a = 0; a < 12; a++) {
            this.p_foot0[a] = ins.readDouble();
        }
 
        this.r_hip = new double[(int) 12];
        for (int a = 0; a < 12; a++) {
            this.r_hip[a] = ins.readDouble();
        }
 
        this.x_desired = new double[(int) 72];
        for (int a = 0; a < 72; a++) {
            this.x_desired[a] = ins.readDouble();
        }
 
        this.gait_enabled = new double[(int) 4];
        for (int a = 0; a < 4; a++) {
            this.gait_enabled[a] = ins.readDouble();
        }
 
        this.phase_variable = new double[(int) 4];
        for (int a = 0; a < 4; a++) {
            this.phase_variable[a] = ins.readDouble();
        }
 
        this.period_time = new double[(int) 4];
        for (int a = 0; a < 4; a++) {
            this.period_time[a] = ins.readDouble();
        }
 
        this.time_swing = new double[(int) 4];
        for (int a = 0; a < 4; a++) {
            this.time_swing[a] = ins.readDouble();
        }
 
        this.mass = ins.readDouble();
 
        this.inertia = new double[(int) 3];
        for (int a = 0; a < 3; a++) {
            this.inertia[a] = ins.readDouble();
        }
 
        this.gravity = new double[(int) 3];
        for (int a = 0; a < 3; a++) {
            this.gravity[a] = ins.readDouble();
        }
 
        this.mu = new double[(int) 4];
        for (int a = 0; a < 4; a++) {
            this.mu[a] = ins.readDouble();
        }
 
        this.z_g = new double[(int) 4];
        for (int a = 0; a < 4; a++) {
            this.z_g[a] = ins.readDouble();
        }
 
        this.Q = new double[(int) 12];
        for (int a = 0; a < 12; a++) {
            this.Q[a] = ins.readDouble();
        }
 
        this.R = new double[(int) 24];
        for (int a = 0; a < 24; a++) {
            this.R[a] = ins.readDouble();
        }
 
        this.K_HX = new double[(int) 30];
        for (int a = 0; a < 30; a++) {
            this.K_HX[a] = ins.readDouble();
        }
 
    }
 
    public lcmtypes.rpc_inputs_t copy()
    {
        lcmtypes.rpc_inputs_t outobj = new lcmtypes.rpc_inputs_t();
        outobj.current_state = new double[(int) 12];
        System.arraycopy(this.current_state, 0, outobj.current_state, 0, 12); 
        outobj.p_foot0 = new double[(int) 12];
        System.arraycopy(this.p_foot0, 0, outobj.p_foot0, 0, 12); 
        outobj.r_hip = new double[(int) 12];
        System.arraycopy(this.r_hip, 0, outobj.r_hip, 0, 12); 
        outobj.x_desired = new double[(int) 72];
        System.arraycopy(this.x_desired, 0, outobj.x_desired, 0, 72); 
        outobj.gait_enabled = new double[(int) 4];
        System.arraycopy(this.gait_enabled, 0, outobj.gait_enabled, 0, 4); 
        outobj.phase_variable = new double[(int) 4];
        System.arraycopy(this.phase_variable, 0, outobj.phase_variable, 0, 4); 
        outobj.period_time = new double[(int) 4];
        System.arraycopy(this.period_time, 0, outobj.period_time, 0, 4); 
        outobj.time_swing = new double[(int) 4];
        System.arraycopy(this.time_swing, 0, outobj.time_swing, 0, 4); 
        outobj.mass = this.mass;
 
        outobj.inertia = new double[(int) 3];
        System.arraycopy(this.inertia, 0, outobj.inertia, 0, 3); 
        outobj.gravity = new double[(int) 3];
        System.arraycopy(this.gravity, 0, outobj.gravity, 0, 3); 
        outobj.mu = new double[(int) 4];
        System.arraycopy(this.mu, 0, outobj.mu, 0, 4); 
        outobj.z_g = new double[(int) 4];
        System.arraycopy(this.z_g, 0, outobj.z_g, 0, 4); 
        outobj.Q = new double[(int) 12];
        System.arraycopy(this.Q, 0, outobj.Q, 0, 12); 
        outobj.R = new double[(int) 24];
        System.arraycopy(this.R, 0, outobj.R, 0, 24); 
        outobj.K_HX = new double[(int) 30];
        System.arraycopy(this.K_HX, 0, outobj.K_HX, 0, 30); 
        return outobj;
    }
 
}
