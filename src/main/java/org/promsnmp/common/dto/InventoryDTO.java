package org.promsnmp.common.dto;

import lombok.Data;
import org.promsnmp.common.model.NetworkDevice;

import java.util.List;

@Data
public class InventoryDTO {
    private List<NetworkDevice> devices;
    private List<DiscoverySeedDTO> discoverySeeds; //fixme: probably should reference model class here
}
