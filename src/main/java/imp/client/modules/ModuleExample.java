package imp.client.modules;

import imp.client.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class ModuleExample extends Module {
    public ModuleExample() {
        super(Addon.COMBAT, "example", "An example module in a custom category.");
    }
}
