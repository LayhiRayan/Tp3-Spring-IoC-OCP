package metier;
import dao.IDao;
import java.util.List;
import java.util.Map;
public class MetierMultiple implements IMetier {
    private final List<IDao> daos;
    private final Map<String, IDao> daoMap;
    public MetierMultiple(List<IDao> daos, Map<String, IDao> daoMap) {
        this.daos = daos; this.daoMap = daoMap;
    }
    public double calcul() { return daos.stream().mapToDouble(IDao::getValue).sum(); }
    public Map<String, IDao> getDaoMap() { return java.util.Collections.unmodifiableMap(daoMap); }
}
