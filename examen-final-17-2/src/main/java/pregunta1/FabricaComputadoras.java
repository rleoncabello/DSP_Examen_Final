package pregunta1;

public interface FabricaComputadoras
{
    public FabricaComputadoras() {
     	getFinish();
        getStorage();
        getProcessor();
        getMemory();
    }
    
 	
 	public abstract Finish getFinish();
    public abstract Storage getStorage();
    public abstract Processor getProcessor();
    public abstract Memory getMemory();
    

}