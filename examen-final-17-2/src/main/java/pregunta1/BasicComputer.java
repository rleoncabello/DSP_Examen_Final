package pregunta1;

public class BasicComputer implements FabricaComputadoras
{
    public BasicComputer() {
    }
    
     public Finish getFinish() {
        return new WhiteFinish();
    }
    
     public Storage getStorage() {
        return new SmallHardDisk();
    }
    
     public Processor getProcessor() {
         return new BasicProcessor();
     }
     
      public Memory getMemory() {
         return new BasicMemory();
     }
}