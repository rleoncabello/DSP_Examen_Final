package pregunta1;

public class DeveloperComputer implements FabricaComputadoras
{
    public DeveloperComputer() {
    }
    
     public Finish getFinish() {
        return new BlackFinish();
    }
    
     public Storage getStorage() {
        return new MediumHardDisk();
    }
    
     public Processor getProcessor() {
         return new FastProcessor();
     }
     
      public Memory getMemory() {
         return new ProMemory();
     }
}