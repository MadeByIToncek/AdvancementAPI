package net.roxeez.advancement.trigger;

import org.bukkit.Material;
import org.junit.jupiter.api.DisplayName;

@DisplayName("BeeNestDestroyed trigger tests")
public class BeeNestDestroyedTest extends TriggerTest<BeeNestDestroyedData> {

    @Override
    protected Trigger<BeeNestDestroyedData> getTrigger() {
        return TriggerType.BEE_NEST_DESTROYED;
    }

    @Override
    protected BeeNestDestroyedData getObject() {
        BeeNestDestroyedData object = new BeeNestDestroyedData();

        object.setBlock(Material.BEE_NEST);
        object.withItem(Material.IRON_AXE);
        object.withBeeCount(3);

        return object;
    }

    @Override
    protected String getJson() {
        return "{\"block\":\"minecraft:bee_nest\",\"item\":{\"item\":\"minecraft:iron_axe\"},\"numBeesInside\":3}";
    }

}