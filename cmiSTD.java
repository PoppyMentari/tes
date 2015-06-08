import java.util.*;
public class CmiStdb{
private CmiEngine cmiEngine ;
private CmiObjectCensor cmiObjcetCensor;
private CmiLightCensor cmiLightCensor;
private CmiCar cmiCar;

private int jumlahSilinder;
private int dayaKerja;
private int ketelitian;
private int sensitifitas;





public CmiObjectCensor() {
int ketelitian = 50<=100;
int sensitifitas = 1<=5;
return new CmiObjectCensor = ((ketelitian*sensitifitas)/5);
}
public CmiLightCensor () {
int ketelitian = 5<=20;
int sensitifitas = 1<=5;
return new CmiLightCensor (ketelitian*sensitifitas);
}
public CmiCar () {
return new CmiCar ((CmiEngine+CmiObjectCensor+CmiLightCensor)/3);
}
}
