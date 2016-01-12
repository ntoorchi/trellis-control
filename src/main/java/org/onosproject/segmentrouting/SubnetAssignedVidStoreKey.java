package org.onosproject.segmentrouting;

import java.util.Objects;

import org.onlab.packet.Ip4Prefix;
import org.onosproject.net.DeviceId;

/**
 * Key of assigned VLAN ID store.
 */
public class SubnetAssignedVidStoreKey {
    private final DeviceId deviceId;
    private final Ip4Prefix subnet;

    /**
     * Constructs the key of per subnet VLAN ID store.
     *
     * @param deviceId device ID of the VLAN cross-connection
     * @param subnet subnet information
     */
    public SubnetAssignedVidStoreKey(DeviceId deviceId, Ip4Prefix subnet) {
        this.deviceId = deviceId;
        this.subnet = subnet;
    }

    /**
     * Returns the device identification used to create this key.
     *
     * @return the device identifier
     */
    public DeviceId deviceId() {
        return deviceId;
    }

    /**
     * Returns the subnet information used to create this key.
     *
     * @return the subnet
     */
    public Ip4Prefix subnet() {
        return subnet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubnetAssignedVidStoreKey)) {
            return false;
        }
        SubnetAssignedVidStoreKey that =
                (SubnetAssignedVidStoreKey) o;
        return (Objects.equals(this.deviceId, that.deviceId) &&
                Objects.equals(this.subnet, that.subnet));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Objects.hashCode(deviceId)
                + Objects.hashCode(subnet);
        return result;
    }

    @Override
    public String toString() {
        return "Device: " + deviceId + " Subnet: " + subnet;
    }

}
