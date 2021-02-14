package net.roxeez.advancement.common;

import net.roxeez.advancement.SerializerTest;
import org.bukkit.entity.EntityType;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Entity tests")
public class EntityTest extends SerializerTest<Entity> {

    @Override
    protected Entity getObject() {
        Entity entity = new Entity();

        entity.is(EntityType.BAT);

        return entity;
    }

    @Override
    protected String getJson() {
        return "{\n" +
                "  \"type\": \"minecraft:bat\"\n" +
                "}";
    }

}
