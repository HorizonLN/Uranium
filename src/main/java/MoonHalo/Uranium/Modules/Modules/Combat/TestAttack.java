package MoonHalo.Uranium.Modules.Modules.Combat;
import MoonHalo.Uranium.Modules.Module;
import MoonHalo.Uranium.Others.ModuleInfo;
import MoonHalo.Uranium.Others.ModuleType;
import MoonHalo.Uranium.Uranium;

import static MoonHalo.Uranium.Others.ModuleType.Combat;

@ModuleInfo(ModName="Attack",info = "This is a test.",type = Combat)
public class TestAttack extends Module{
    public TestAttack() {
        super("TestAttack",Combat);
    }
    @Override
    public void OnEnable(){
        Uranium.logger.info(GetName()+"‘s category is "+GetCategory());
    }
}
