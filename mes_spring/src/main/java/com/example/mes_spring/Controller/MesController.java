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
}
