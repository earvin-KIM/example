package com.example.mes_spring.Controller;

import com.example.mes_spring.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class MesController {
    @Autowired
    private BarcodeRepository barcodeRepository;
    @Autowired
    private BomRepository bomRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private EquipmentRepository equipmentRepository;
    @Autowired
    private EquipmentCheckListRepository equipmentchecklistRepository;
    @Autowired
    private EquipmentCheckRepository equipmentcheckRepository;
    @Autowired
    private EquipmentInspectionRepository equipmentinspectionRepository;
    @Autowired
    private EquipmentPreventionRepository equipmentpreventionRepository;
    @Autowired
    private ErrorCodeRepository errorcodeRepository;
    @Autowired
    private FileBoardRepository fileboardRepository;
    @Autowired
    private FilterRepository filterRepository;
    @Autowired
    private HeatingRepository heatingRepository;
    @Autowired
    private InventoryRepository inventoryRepository;
    @Autowired
    private LavorerRepository lavorerRepository;
    @Autowired
    private LoginLogRepository loginlogRepository;
    @Autowired
    private MaterialMoveRepository materialmoveRepository;
    @Autowired
    private NoticeBoardRepository noticeboardRepository;
    @Autowired
    private OrderDocRepository orderdocRepository;
    @Autowired
    private OrdersRepository ordersRepository;
    @Autowired
    private OrderSheetRepository ordersheetRepository;
    @Autowired
    private PlaceOrderDocRepository placeorderdocRepository;
    @Autowired
    private PlaceOrdersRepository placeordersRepository;
    @Autowired
    private PositionRepository positionRepository;
    @Autowired
    private ProcessRepository processRepository;
    @Autowired
    private ProcessChartRepository processchartRepository;
    @Autowired
    private ProcessCodeRepository processcodeRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductCorrectRepository productcorrectRepository;
    @Autowired
    private ProductHistoryRepository producthistoryRepository;
    @Autowired
    private ProductMoveRepository productmoveRepository;
    @Autowired
    private ProductReturnRepository productreturnRepository;
    @Autowired
    private QAInspectionRepository qainspectionRepository;
    @Autowired
    private QAProductRepository qaproductRepository;
    @Autowired
    private RawHistoryRepository rawhistoryRepository;
    @Autowired
    private RawInspectionRepository rawinspectionRepository;
    @Autowired
    private RawMaterialRepository rawmaterialRepository;
    @Autowired
    private RawMaterialMasterRepository rawmaterialmasterRepository;
    @Autowired
    private RawMaterialtagRepository rawmaterialtagRepository;
    @Autowired
    private RFIDRepository rfidRepository;
    @Autowired
    private RFID_BarrelRepository rfid_barrelRepository;
    @Autowired
    private SetPlusRepository setplusRepository;
    @Autowired
    private ShipInspectionRepository shipinspectionRepository;
    @Autowired
    private ShipOrderDocRepository shiporderdocRepository;
    @Autowired
    private SortRepository sortRepository;
    @Autowired
    private TemperatureRepository temperatureRepository;
    @Autowired
    private TemperatureCheckRepository temperaturecheckRepository;
    @Autowired
    private UnitRepository unitRepository;
    @Autowired
    private UsePageRepository usepageRepository;
    @Autowired
    private WarehouseRepository warehouseRepository;
    @Autowired
    private WashRepository washRepository;
    @Autowired
    private WeightRepository weightRepository;
    @Autowired
    private Weight_RecRepository weight_recRepository;
    @Autowired
    private WorkerRepository workerRepository;
    @Autowired
    private WorkOrderDocRepository workorderdocRepository;
    @Autowired
    private WorkPerformanceRepository workperformanceRepository;
    @Autowired
    private WorkStandardRepository workstandardRepository;
    // 모든 게시글 부름
    @GetMapping("/barcode")
    public List getBarcode() {
        return barcodeRepository.findAll();
    }
    @GetMapping("/bom")
    public List getBom() {
        return bomRepository.findAll();
    }
    @GetMapping("/client")
    public List getClient() {
        return clientRepository.findAll();
    }
    @GetMapping("/customer")
    public List getCustomer() {
        return customerRepository.findAll();
    }
    @GetMapping("/department")
    public List getDepartment() {
        return departmentRepository.findAll();
    }
    @GetMapping("/equipment")
    public List getEquipment() {
        return equipmentRepository.findAll();
    }
    @GetMapping("/equipmentchecklist")
    public List getEquipmentCheckList() {
        return equipmentchecklistRepository.findAll();
    }
    @GetMapping("/equipmentcheck")
    public List getEquipmentCheck() {
        return equipmentcheckRepository.findAll();
    }
    @GetMapping("/equipmentinspection")
    public List getEquipmentInspection() {
        return equipmentinspectionRepository.findAll();
    }
    @GetMapping("/equipmentprevention")
    public List getEquipmentPrevention() {
        return equipmentpreventionRepository.findAll();
    }
    @GetMapping("/errorcode")
    public List getErrorCode() {
        return errorcodeRepository.findAll();
    }
    @GetMapping("/fileboard")
    public List getFileBoard() {
        return fileboardRepository.findAll();
    }
    @GetMapping("/filter")
    public List getFilter() {
        return filterRepository.findAll();
    }
    @GetMapping("/heating")
    public List getHeating() {
        return heatingRepository.findAll();
    }
    @GetMapping("/inventory")
    public List getInventory() {
        return inventoryRepository.findAll();
    }
    @GetMapping("/lavorer")
    public List getLavoer() {
        return lavorerRepository.findAll();
    }
    @GetMapping("/loginlog")
    public List getLoginLog() {
        return loginlogRepository.findAll();
    }
    @GetMapping("/materialmove")
    public List getMaterialMove() {
        return materialmoveRepository.findAll();
    }
    @GetMapping("/noticeboard")
    public List getNoticeBoard() {
        return noticeboardRepository.findAll();
    }
    @GetMapping("/orderdoc")
    public List getOrderDoc() {
        return orderdocRepository.findAll();
    }
    @GetMapping("/orders")
    public List getOrders() {
        return ordersRepository.findAll();
    }
    @GetMapping("/ordersheet")
    public List getOrderSheet() {
        return ordersheetRepository.findAll();
    }
    @GetMapping("/placeorderdoc")
    public List getPlaceOrderDoc() {
        return placeorderdocRepository.findAll();
    }
    @GetMapping("/placeorders")
    public List getPlaceOrders() {
        return placeordersRepository.findAll();
    }
    @GetMapping("/position")
    public List getPosition() {
        return positionRepository.findAll();
    }
    @GetMapping("/process")
    public List getProcess() {
        return processRepository.findAll();
    }
    @GetMapping("/processchart")
    public List getProcessChart() {
        return processchartRepository.findAll();
    }
    @GetMapping("/processcode")
    public List getProcessCode() {
        return processcodeRepository.findAll();
    }
    @GetMapping("/product")
    public List getProduct() {
        return productRepository.findAll();
    }
    @GetMapping("/productcorrect")
    public List getProductCorrect() {
        return productcorrectRepository.findAll();
    }
    @GetMapping("/producthistory")
    public List getProductHistory() {
        return producthistoryRepository.findAll();
    }
    @GetMapping("/productmove")
    public List getProductMove() {
        return productmoveRepository.findAll();
    }
    @GetMapping("/productreturn")
    public List getProductReturn() {
        return productreturnRepository.findAll();
    }
    @GetMapping("/qainspection")
    public List getQAInspection() {
        return qainspectionRepository.findAll();
    }
    @GetMapping("/qaproduct")
    public List getQAproduct() {
        return qaproductRepository.findAll();
    }
    @GetMapping("/rawhistory")
    public List getRawHistory() {
        return rawhistoryRepository.findAll();
    }
    @GetMapping("/rawinspection")
    public List getRawInspection() {
        return rawinspectionRepository.findAll();
    }
    @GetMapping("/rawmaterial")
    public List getRawMaterial() {
        return rawmaterialRepository.findAll();
    }
    @GetMapping("/rawmaterialmaster")
    public List getRawmaterialMaster() {
        return rawmaterialmasterRepository.findAll();
    }
    @GetMapping("/rawmaterialtag")
    public List getRawMaterialtag() {
        return rawmaterialtagRepository.findAll();
    }
    @GetMapping("/rfid")
    public List RFID() {
        return rfidRepository.findAll();
    }
    @GetMapping("/rfid_barrel")
    public List getRFID_Barrel() {
        return rfid_barrelRepository.findAll();
    }
    @GetMapping("/setplus")
    public List getSetPlus() {
        return setplusRepository.findAll();
    }
    @GetMapping("/shipinspection")
    public List getShipInspection() {
        return shipinspectionRepository.findAll();
    }
    @GetMapping("/shiporderdoc")
    public List getShipOrderDoc() {
        return shiporderdocRepository.findAll();
    }
    @GetMapping("/sort")
    public List getSort() {
        return sortRepository.findAll();
    }
    @GetMapping("/temperature")
    public List getTemperature() {
        return temperatureRepository.findAll();
    }
    @GetMapping("/temperaturecheck")
    public List getTemperaturecheck() {
        return temperaturecheckRepository.findAll();
    }
    @GetMapping("/unit")
    public List getUnit() {
        return unitRepository.findAll();
    }
    @GetMapping("/usepage")
    public List getUsePage() {
        return usepageRepository.findAll();
    }
    @GetMapping("/warehouse")
    public List getWareHouse() {
        return warehouseRepository.findAll();
    }
    @GetMapping("/wash")
    public List getWash() {
        return washRepository.findAll();
    }
    @GetMapping("/weight")
    public List getWeight() {
        return weightRepository.findAll();
    }
    @GetMapping("/weight_rec")
    public List getWeight_rec() {
        return weight_recRepository.findAll();
    }
    @GetMapping("/worker")
    public List getWorker() {
        return workerRepository.findAll();
    }
    @GetMapping("/workorderdoc")
    public List getWorkOrderDoc() {
        return workorderdocRepository.findAll();
    }
    @GetMapping("/workperformance")
    public List getWorkPerformance() {
        return workperformanceRepository.findAll();
    }
    @GetMapping("/workstandard")
    public List getWorkStandard() {
        return workstandardRepository.findAll();
    }
}
