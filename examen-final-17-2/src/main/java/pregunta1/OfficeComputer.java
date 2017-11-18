package pregunta1;

public class OfficeComputer implements FabricaComputadoras
{
    public OfficeComputer() {
    }
    
     public Finish getFinish() {
        return new WhiteFinish();
    }
    
     public Storage getStorage() {
        return new MediumHardDisk();
    }
    
     public Processor getProcessor() {
         return new FastProcessor();
     }
     
      public Memory getMemory() {
         return new AdvancedMemory();
     }
}