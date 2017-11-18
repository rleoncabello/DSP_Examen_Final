package pregunta1;

public class HighEndComputer implements FabricaComputadoras
{
    public HighEndComputer() {
    }
    
     public Finish getFinish() {
        return new BlackFinish();
    }
    
     public Storage getStorage() {
        return new HugeFlash();
    }
    
     public Processor getProcessor() {
         return new HighEndProcessor();
     }
     
      public Memory getMemory() {
         return new ProMemory();
     }
}