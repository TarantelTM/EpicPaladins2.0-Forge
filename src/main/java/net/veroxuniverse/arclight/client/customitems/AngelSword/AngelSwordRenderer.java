package net.veroxuniverse.arclight.client.customitems.AngelSword;

import net.veroxuniverse.arclight.item.AngelSwordItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class AngelSwordRenderer extends GeoItemRenderer<AngelSwordItem> {

    public AngelSwordRenderer() {
        super(new AngelSwordModel());
    }
}
