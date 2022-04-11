package com.example.mes_spring.Controller;

import com.example.mes_spring.Repository.*;
import com.example.mes_spring.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.lang.RuntimeException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
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
    @Autowired
    private TestRepository testRepository;
    // GetMapping
    @GetMapping("/barcode")
    public List<barcode> getBarcode() {
        return barcodeRepository.findAll();
    }
    @GetMapping("/bom")
    public List<bom> getBom() {
        return bomRepository.findAll();
    }
    @GetMapping("/client")
    public List<client> getClient() {
        return clientRepository.findAll();
    }
    @GetMapping("/customer")
    public List<customer> getCustomer() {
        return customerRepository.findAll();
    }
    @GetMapping("/department")
    public List<department> getDepartment() {
        return departmentRepository.findAll();
    }
    @GetMapping("/equipment")
    public List<equipment> getEquipment() {
        return equipmentRepository.findAll();
    }
    @GetMapping("/equipmentchecklist")
    public List<equipmentchecklist> getEquipmentCheckList() {
        return equipmentchecklistRepository.findAll();
    }
    @GetMapping("/equipmentcheck")
    public List<equipmentcheck> getEquipmentCheck() {
        return equipmentcheckRepository.findAll();
    }
    @GetMapping("/equipmentinspection")
    public List<equipmentinspection> getEquipmentInspection() {
        return equipmentinspectionRepository.findAll();
    }
    @GetMapping("/equipmentprevention")
    public List<equipmentprevention> getEquipmentPrevention() {
        return equipmentpreventionRepository.findAll();
    }
    @GetMapping("/errorcode")
    public List<errorcode> getErrorCode() {
        return errorcodeRepository.findAll();
    }
    @GetMapping("/fileboard")
    public List<fileboard> getFileBoard() {
        return fileboardRepository.findAll();
    }
    @GetMapping("/filter")
    public List<filter> getFilter() {
        return filterRepository.findAll();
    }
    @GetMapping("/heating")
    public List<heating> getHeating() {
        return heatingRepository.findAll();
    }
    @GetMapping("/inventory")
    public List<inventory> getInventory() {
        return inventoryRepository.findAll();
    }
    @GetMapping("/lavorer")
    public List<lavorer> getLavoer() {
        return lavorerRepository.findAll();
    }
    @GetMapping("/loginlog")
    public List<loginlog> getLoginLog() {
        return loginlogRepository.findAll();
    }
    @GetMapping("/materialmove")
    public List<materialmove> getMaterialMove() {
        return materialmoveRepository.findAll();
    }
    @GetMapping("/noticeboard")
    public List<noticeboard> getNoticeBoard() {
        return noticeboardRepository.findAll();
    }
    @GetMapping("/orderdoc")
    public List<orderdoc> getOrderDoc() {
        return orderdocRepository.findAll();
    }
    @GetMapping("/orders")
    public List<orders> getOrders() {
        return ordersRepository.findAll();
    }
    @GetMapping("/ordersheet")
    public List<ordersheet> getOrderSheet() {
        return ordersheetRepository.findAll();
    }
    @GetMapping("/placeorderdoc")
    public List<placeorderdoc> getPlaceOrderDoc() {
        return placeorderdocRepository.findAll();
    }
    @GetMapping("/placeorders")
    public List<placeorders> getPlaceOrders() {
        return placeordersRepository.findAll();
    }
    @GetMapping("/position")
    public List<position> getPosition() {
        return positionRepository.findAll();
    }
    @GetMapping("/process")
    public List<process> getProcess() {
        return processRepository.findAll();
    }
    @GetMapping("/processchart")
    public List<processchart> getProcessChart() {
        return processchartRepository.findAll();
    }
    @GetMapping("/processcode")
    public List<processcode> getProcessCode() {
        return processcodeRepository.findAll();
    }
    @GetMapping("/product")
    public List<product> getProduct() {
        return productRepository.findAll();
    }
    @GetMapping("/productcorrect")
    public List<productcorrect> getProductCorrect() {
        return productcorrectRepository.findAll();
    }
    @GetMapping("/producthistory")
    public List<producthistory> getProductHistory() {
        return producthistoryRepository.findAll();
    }
    @GetMapping("/productmove")
    public List<productmove> getProductMove() {
        return productmoveRepository.findAll();
    }
    @GetMapping("/productreturn")
    public List<productreturn> getProductReturn() {
        return productreturnRepository.findAll();
    }
    @GetMapping("/qainspection")
    public List<qainspection> getQAInspection() {
        return qainspectionRepository.findAll();
    }
    @GetMapping("/qaproduct")
    public List<qaproduct> getQAproduct() {
        return qaproductRepository.findAll();
    }
    @GetMapping("/rawhistory")
    public List<rawhistory> getRawHistory() {
        return rawhistoryRepository.findAll();
    }
    @GetMapping("/rawinspection")
    public List<rawinspection> getRawInspection() {
        return rawinspectionRepository.findAll();
    }
    @GetMapping("/rawmaterial")
    public List<rawmaterial> getRawMaterial() {
        return rawmaterialRepository.findAll();
    }
    @GetMapping("/rawmaterialmaster")
    public List<rawmaterialmaster> getRawmaterialMaster() {
        return rawmaterialmasterRepository.findAll();
    }
    @GetMapping("/rawmaterialtag")
    public List<rawmaterialtag> getRawMaterialtag() {
        return rawmaterialtagRepository.findAll();
    }
    @GetMapping("/rfid")
    public List<rfid> RFID() {
        return rfidRepository.findAll();
    }
    @GetMapping("/rfid_barrel")
    public List<rfid_barrel> getRFID_Barrel() {
        return rfid_barrelRepository.findAll();
    }
    @GetMapping("/setplus")
    public List<setplus> getSetPlus() {
        return setplusRepository.findAll();
    }
    @GetMapping("/shipinspection")
    public List<shipinspection> getShipInspection() {
        return shipinspectionRepository.findAll();
    }
    @GetMapping("/shiporderdoc")
    public List<shiporderdoc> getShipOrderDoc() {
        return shiporderdocRepository.findAll();
    }
    @GetMapping("/sort")
    public List<sort> getSort() {
        return sortRepository.findAll();
    }
    @GetMapping("/temperature")
    public List<temperature> getTemperature() {
        return temperatureRepository.findAll();
    }
    @GetMapping("/temperaturecheck")
    public List<temperaturecheck> getTemperaturecheck() {
        return temperaturecheckRepository.findAll();
    }
    @GetMapping("/unit")
    public List<unit> getUnit() {
        return unitRepository.findAll();
    }
    @GetMapping("/usepage")
    public List<usepage> getUsePage() {
        return usepageRepository.findAll();
    }
    @GetMapping("/warehouse")
    public List<warehouse> getWareHouse() {
        return warehouseRepository.findAll();
    }
    @GetMapping("/wash")
    public List<wash> getWash() {
        return washRepository.findAll();
    }
    @GetMapping("/weight")
    public List<weight> getWeight() {
        return weightRepository.findAll();
    }
    @GetMapping("/weight_rec")
    public List<weight_rec> getWeight_rec() {
        return weight_recRepository.findAll();
    }
    @GetMapping("/worker")
    public List<worker> getWorker() {
        return workerRepository.findAll();
    }
    @GetMapping("/workorderdoc")
    public List<workorderdoc> getWorkOrderDoc() {
        return workorderdocRepository.findAll();
    }
    @GetMapping("/workperformance")
    public List<workperformance> getWorkPerformance() {
        return workperformanceRepository.findAll();
    }
    @GetMapping("/workstandard")
    public List<workstandard> getWorkStandard() {
        return workstandardRepository.findAll();
    }
    //PostMapping
    @PostMapping("/barcode")
    public barcode createbarcode(@RequestBody barcode barcode) {
        return barcodeRepository.save(barcode);
    }
    @PostMapping("/bom")
    public bom createbom(@RequestBody bom bom) {
        return bomRepository.save(bom);
    }
    @PostMapping("/client")
    public client createclient(@RequestBody client client) {
        return clientRepository.save(client);
    }
    @PostMapping("/customer")
    public customer createcustomer(@RequestBody customer customer) {
        return customerRepository.save(customer);
    }
    @PostMapping("/department")
    public department createdepartment(@RequestBody department department) {
        return departmentRepository.save(department);
    }
    @PostMapping("/equipment")
    public equipment createequipment(@RequestBody equipment equipment) {
        return equipmentRepository.save(equipment);
    }
    @PostMapping("/equipmentchecklist")
    public equipmentchecklist createequipmentchecklist(@RequestBody equipmentchecklist equipmentchecklist) {
        return equipmentchecklistRepository.save(equipmentchecklist);
    }
    @PostMapping("/equipmentcheck")
    public equipmentcheck createequipmentcheck(@RequestBody equipmentcheck equipmentcheck) {
        return equipmentcheckRepository.save(equipmentcheck);
    }
    @PostMapping("/equipmentinspection")
    public equipmentinspection createequipmentinspection(@RequestBody equipmentinspection equipmentinspection) {
        return equipmentinspectionRepository.save(equipmentinspection);
    }
    @PostMapping("/equipmentprevention")
    public equipmentprevention createequipmentprevention(@RequestBody equipmentprevention equipmentprevention) {
        return equipmentpreventionRepository.save(equipmentprevention);
    }
    @PostMapping("/errorcode")
    public errorcode createerrorcode(@RequestBody errorcode errorcode) {
        return errorcodeRepository.save(errorcode);
    }
    @PostMapping("/test")
    public Test createerrorcode(@RequestBody Test test) {
        return testRepository.save(test);
    }
    @PostMapping("/fileboard")
    public fileboard createfileboard(@RequestBody fileboard fileboard) {
        return fileboardRepository.save(fileboard);
    }
    @PostMapping("/filter")
    public filter createfilter(@RequestBody filter filter) {
        return filterRepository.save(filter);
    }
    @PostMapping("/heating")
    public heating createheating(@RequestBody heating heating) {
        return heatingRepository.save(heating);
    }
    @PostMapping("/inventory")
    public inventory createinventory(@RequestBody inventory inventory) {
        return inventoryRepository.save(inventory);
    }
    @PostMapping("/lavorer")
    public lavorer createlavorer(@RequestBody lavorer lavorer) {
        return lavorerRepository.save(lavorer);
    }
    @PostMapping("/loginlog")
    public loginlog createloginlog(@RequestBody loginlog loginlog) {
        return loginlogRepository.save(loginlog);
    }
    @PostMapping("/materialmove")
    public materialmove creatematerialmove(@RequestBody materialmove materialmove) {
        return materialmoveRepository.save(materialmove);
    }
    @PostMapping("/noticeboard")
    public noticeboard createnoticeboard(@RequestBody noticeboard noticeboard) {
        return noticeboardRepository.save(noticeboard);
    }
    @PostMapping("/orderdoc")
    public orderdoc createorderdoc(@RequestBody orderdoc orderdoc) {
        return orderdocRepository.save(orderdoc);
    }
    @PostMapping("/orders")
    public orders createorders(@RequestBody orders orders) {
        return ordersRepository.save(orders);
    }
    @PostMapping("/ordersheet")
    public ordersheet createordersheet(@RequestBody ordersheet ordersheet) {
        return ordersheetRepository.save(ordersheet);
    }
    @PostMapping("/placeorderdoc")
    public placeorderdoc createplaceorderdoc(@RequestBody placeorderdoc placeorderdoc) {
        return placeorderdocRepository.save(placeorderdoc);
    }
    @PostMapping("/placeorders")
    public placeorders createplaceorders(@RequestBody placeorders placeorders) {
        return placeordersRepository.save(placeorders);
    }
    @PostMapping("/position")
    public position createposition(@RequestBody position position) {
        return positionRepository.save(position);
    }
    @PostMapping("/process")
    public process createprocess(@RequestBody process process) {
        return processRepository.save(process);
    }
    @PostMapping("/processchart")
    public processchart createprocesschart(@RequestBody processchart processchart) {
        return processchartRepository.save(processchart);
    }
    @PostMapping("/processcode")
    public processcode createprocesscode(@RequestBody processcode processcode) {
        return processcodeRepository.save(processcode);
    }
    @PostMapping("/product")
    public product createproduct(@RequestBody product product) {
        return productRepository.save(product);
    }
    @PostMapping("/productcorrect")
    public productcorrect createproductcorrect(@RequestBody productcorrect productcorrect) {
        return productcorrectRepository.save(productcorrect);
    }
    @PostMapping("/producthistory")
    public producthistory createproducthistory(@RequestBody producthistory producthistory) {
        return producthistoryRepository.save(producthistory);
    }
    @PostMapping("/productmove")
    public productmove createproductmove(@RequestBody productmove productmove) {
        return productmoveRepository.save(productmove);
    }
    @PostMapping("/productreturn")
    public productreturn createproductreturn(@RequestBody productreturn productreturn) {
        return productreturnRepository.save(productreturn);
    }
    @PostMapping("/qainspection")
    public qainspection createqainspection(@RequestBody qainspection qainspection) {
        return qainspectionRepository.save(qainspection);
    }
    @PostMapping("/qaproduct")
    public qaproduct createqaproduct(@RequestBody qaproduct qaproduct) {
        return qaproductRepository.save(qaproduct);
    }
    @PostMapping("/rawhistory")
    public rawhistory createrawhistory(@RequestBody rawhistory rawhistory) {
        return rawhistoryRepository.save(rawhistory);
    }
    @PostMapping("/rawinspection")
    public rawinspection createrawinspection(@RequestBody rawinspection rawinspection) {
        return rawinspectionRepository.save(rawinspection);
    }
    @PostMapping("/rawmaterial")
    public rawmaterial createrawmaterial(@RequestBody rawmaterial rawmaterial) {
        return rawmaterialRepository.save(rawmaterial);
    }
    @PostMapping("/rawmaterialmaster")
    public rawmaterialmaster createrawmaterialmaster(@RequestBody rawmaterialmaster rawmaterialmaster) {
        return rawmaterialmasterRepository.save(rawmaterialmaster);
    }
    @PostMapping("/rawmaterialtag")
    public rawmaterialtag createrawmaterialtag(@RequestBody rawmaterialtag rawmaterialtag) {
        return rawmaterialtagRepository.save(rawmaterialtag);
    }
    @PostMapping("/rfid")
    public rfid createrfid(@RequestBody rfid rfid) {
        return rfidRepository.save(rfid);
    }
    @PostMapping("/rfid_barrel")
    public rfid_barrel createrfid_barrel(@RequestBody rfid_barrel rfid_barrel) {
        return rfid_barrelRepository.save(rfid_barrel);
    }
    @PostMapping("/setplus")
    public setplus createsetplus(@RequestBody setplus setplus) {
        return setplusRepository.save(setplus);
    }
    @PostMapping("/shipinspection")
    public shipinspection createshipinspection(@RequestBody shipinspection shipinspection) {
        return shipinspectionRepository.save(shipinspection);
    }
    @PostMapping("/shiporderdoc")
    public shiporderdoc createshiporderdoc(@RequestBody shiporderdoc shiporderdoc) {
        return shiporderdocRepository.save(shiporderdoc);
    }
    @PostMapping("/sort")
    public sort createsort(@RequestBody sort sort) {
        return sortRepository.save(sort);
    }
    @PostMapping("/temperature")
    public temperature createtemperature(@RequestBody temperature temperature) {
        return temperatureRepository.save(temperature);
    }
    @PostMapping("/temperaturecheck")
    public temperaturecheck createtemperaturecheck(@RequestBody temperaturecheck temperaturecheck) {
        return temperaturecheckRepository.save(temperaturecheck);
    }
    @PostMapping("/unit")
    public unit createunit(@RequestBody unit unit) {
        return unitRepository.save(unit);
    }
    @PostMapping("/usepage")
    public usepage createusepage(@RequestBody usepage usepage) {
        return usepageRepository.save(usepage);
    }
    @PostMapping("/warehouse")
    public warehouse createwarehouse(@RequestBody warehouse warehouse) {
        return warehouseRepository.save(warehouse);
    }
    @PostMapping("/wash")
    public wash createwash(@RequestBody wash wash) {
        return washRepository.save(wash);
    }
    @PostMapping("/weight")
    public weight createweight(@RequestBody weight weight) {
        return weightRepository.save(weight);
    }
    @PostMapping("/weight_rec")
    public weight_rec createweight_rec(@RequestBody weight_rec weight_rec) {
        return weight_recRepository.save(weight_rec);
    }
    @PostMapping("/worker")
    public worker createworker(@RequestBody worker worker) {
        return workerRepository.save(worker);
    }
    @PostMapping("/workorderdoc")
    public workorderdoc createworkorderdoc(@RequestBody workorderdoc workorderdoc) {
        return workorderdocRepository.save(workorderdoc);
    }
    @PostMapping("/workperformance")
    public workperformance createworkperformance(@RequestBody workperformance workperformance) {
        return workperformanceRepository.save(workperformance);
    }
    @PostMapping("/workstandard")
    public workstandard createworkstandard(@RequestBody workstandard workstandard) {
        return workstandardRepository.save(workstandard);
    }
    // GetMapping ID
    @GetMapping("/barcode/{ID}")
    public ResponseEntity <barcode> getBarcodeByID(@PathVariable Integer ID) {
        barcode barcode=barcodeRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(barcode);
    }
    @GetMapping("/bom/{ID}")
    public ResponseEntity <bom> getBomByID(@PathVariable Integer ID) {
        bom bom=bomRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(bom);
    }
    @GetMapping("/client/{ID}")
    public ResponseEntity <client> getClientByID(@PathVariable Integer ID) {
        client client=clientRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(client);
    }
    @GetMapping("/customer/{ID}")
    public ResponseEntity <customer> getCustomerByID(@PathVariable Integer ID) {
        customer customer=customerRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(customer);
    }
    @GetMapping("/department/{ID}")
    public ResponseEntity <department> getDepartmentByID(@PathVariable Integer ID) {
        department department=departmentRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(department);
    }
    @GetMapping("/equipment/{ID}")
    public ResponseEntity <equipment> getEquipmentByID(@PathVariable Integer ID) {
        equipment equipment=equipmentRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(equipment);
    }
    @GetMapping("/equipmentchecklist/{ID}")
    public ResponseEntity <equipmentchecklist> getEquipmentCheckListByID(@PathVariable Integer ID) {
        equipmentchecklist equipmentchecklist=equipmentchecklistRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(equipmentchecklist);
    }
    @GetMapping("/equipmentcheck/{ID}")
    public ResponseEntity <equipmentcheck> getEquipmentCheckByID(@PathVariable Integer ID) {
        equipmentcheck equipmentcheck=equipmentcheckRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(equipmentcheck);
    }
    @GetMapping("/equipmentinspection/{ID}")
    public ResponseEntity <equipmentinspection> getEquipmentInspectionByID(@PathVariable Integer ID) {
        equipmentinspection equipmentinspection=equipmentinspectionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(equipmentinspection);
    }
    @GetMapping("/equipmentprevention/{ID}")
    public ResponseEntity <equipmentprevention> getEquipmentPreventionByID(@PathVariable Integer ID) {
        equipmentprevention equipmentprevention=equipmentpreventionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(equipmentprevention);
    }
    @GetMapping("/errorcode/{ID}")
    public ResponseEntity <errorcode> getErrorCodeByID(@PathVariable Integer ID) {
        errorcode errorcode=errorcodeRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(errorcode);
    }
    @GetMapping("/fileboard/{ID}")
    public ResponseEntity <fileboard> getFileBoardByID(@PathVariable Integer ID) {
        fileboard fileboard=fileboardRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(fileboard);
    }
    @GetMapping("/filter/{ID}")
    public ResponseEntity <filter> getFilterByID(@PathVariable Integer ID) {
        filter filter=filterRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(filter);
    }
    @GetMapping("/heating/{ID}")
    public ResponseEntity <heating> getHeatingByID(@PathVariable Integer ID) {
        heating heating=heatingRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(heating);
    }
    @GetMapping("/inventory/{ID}")
    public ResponseEntity <inventory> getInventoryByID(@PathVariable Integer ID) {
        inventory inventory=inventoryRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(inventory);
    }
    @GetMapping("/lavorer/{ID}")
    public ResponseEntity <lavorer> getLavoerByID(@PathVariable Integer ID) {
        lavorer lavorer=lavorerRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(lavorer);
    }
    @GetMapping("/loginlog/{ID}")
    public ResponseEntity <loginlog> getLoginLogByID(@PathVariable Integer ID) {
        loginlog loginlog=loginlogRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(loginlog);
    }
    @GetMapping("/materialmove/{ID}")
    public ResponseEntity <materialmove> getMaterialMoveByID(@PathVariable Integer ID) {
        materialmove materialmove=materialmoveRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(materialmove);
    }
    @GetMapping("/noticeboard/{ID}")
    public ResponseEntity <noticeboard> getNoticeBoardByID(@PathVariable Integer ID) {
        noticeboard noticeboard=noticeboardRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(noticeboard);
    }
    @GetMapping("/orderdoc/{ID}")
    public ResponseEntity <orderdoc> getOrderDocByID(@PathVariable Integer ID) {
        orderdoc orderdoc=orderdocRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(orderdoc);
    }
    @GetMapping("/orders/{ID}")
    public ResponseEntity <orders> getOrdersByID(@PathVariable Integer ID) {
        orders orders=ordersRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(orders);
    }
    @GetMapping("/ordersheet/{ID}")
    public ResponseEntity <ordersheet> getOrderSheetByID(@PathVariable Integer ID) {
        ordersheet ordersheet=ordersheetRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(ordersheet);
    }
    @GetMapping("/placeorderdoc/{ID}")
    public ResponseEntity <placeorderdoc> getPlaceOrderDocByID(@PathVariable Integer ID) {
        placeorderdoc placeorderdoc=placeorderdocRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(placeorderdoc);
    }
    @GetMapping("/placeorders/{ID}")
    public ResponseEntity <placeorders> getPlaceOrdersByID(@PathVariable Integer ID) {
        placeorders placeorders=placeordersRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(placeorders);
    }
    @GetMapping("/position/{ID}")
    public ResponseEntity <position> getPositionByID(@PathVariable Integer ID) {
        position position=positionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(position);
    }
    @GetMapping("/process/{ID}")
    public ResponseEntity <process> getProcessByID(@PathVariable Integer ID) {
        process process=processRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(process);
    }
    @GetMapping("/processchart/{ID}")
    public ResponseEntity <processchart> getProcessChartByID(@PathVariable Integer ID) {
        processchart processchart=processchartRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(processchart);
    }
    @GetMapping("/processcode/{ID}")
    public ResponseEntity <processcode> getProcessCodeByID(@PathVariable Integer ID) {
        processcode processcode=processcodeRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(processcode);
    }
    @GetMapping("/product/{ID}")
    public ResponseEntity <product> getProductByID(@PathVariable Integer ID) {
        product product=productRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(product);
    }
    @GetMapping("/productcorrect/{ID}")
    public ResponseEntity <productcorrect> getProductCorrectByID(@PathVariable Integer ID) {
        productcorrect productcorrect=productcorrectRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(productcorrect);
    }
    @GetMapping("/producthistory/{ID}")
    public ResponseEntity <producthistory> getProductHistoryByID(@PathVariable Integer ID) {
        producthistory producthistory=producthistoryRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(producthistory);
    }
    @GetMapping("/productmove/{ID}")
    public ResponseEntity <productmove> getProductMoveByID(@PathVariable Integer ID) {
        productmove productmove=productmoveRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(productmove);
    }
    @GetMapping("/productreturn/{ID}")
    public ResponseEntity <productreturn> getProductReturnByID(@PathVariable Integer ID) {
        productreturn productreturn=productreturnRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(productreturn);
    }
    @GetMapping("/qainspection/{ID}")
    public ResponseEntity <qainspection> getQAInspectionByID(@PathVariable Integer ID) {
        qainspection qainspection=qainspectionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(qainspection);
    }
    @GetMapping("/qaproduct/{ID}")
    public ResponseEntity <qaproduct> getQAproductByID(@PathVariable Integer ID) {
        qaproduct qaproduct=qaproductRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(qaproduct);
    }
    @GetMapping("/rawhistory/{ID}")
    public ResponseEntity <rawhistory> getRawHistoryByID(@PathVariable Integer ID) {
        rawhistory rawhistory=rawhistoryRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(rawhistory);
    }
    @GetMapping("/rawinspection/{ID}")
    public ResponseEntity <rawinspection> getRawInspectionByID(@PathVariable Integer ID) {
        rawinspection rawinspection=rawinspectionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(rawinspection);
    }
    @GetMapping("/rawmaterial/{ID}")
    public ResponseEntity <rawmaterial> getRawMaterialByID(@PathVariable Integer ID) {
        rawmaterial rawmaterial=rawmaterialRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(rawmaterial);
    }
    @GetMapping("/rawmaterialmaster/{ID}")
    public ResponseEntity <rawmaterialmaster> getRawmaterialMasterByID(@PathVariable Integer ID) {
        rawmaterialmaster rawmaterialmaster=rawmaterialmasterRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(rawmaterialmaster);
    }
    @GetMapping("/rawmaterialtag/{ID}")
    public ResponseEntity <rawmaterialtag> getRawMaterialtagByID(@PathVariable Integer ID) {
        rawmaterialtag rawmaterialtag=rawmaterialtagRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(rawmaterialtag);
    }
    @GetMapping("/rfid/{ID}")
    public ResponseEntity <rfid> RFIDByID(@PathVariable Integer ID) {
        rfid rfid=rfidRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(rfid);
    }
    @GetMapping("/rfid_barrel/{ID}")
    public ResponseEntity <rfid_barrel> getRFID_BarrelByID(@PathVariable Integer ID) {
        rfid_barrel rfid_barrel=rfid_barrelRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(rfid_barrel);
    }
    @GetMapping("/setplus/{ID}")
    public ResponseEntity <setplus> getSetPlusByID(@PathVariable Integer ID) {
        setplus setplus=setplusRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(setplus);
    }
    @GetMapping("/shipinspection/{ID}")
    public ResponseEntity <shipinspection> getShipInspectionByID(@PathVariable Integer ID) {
        shipinspection shipinspection=shipinspectionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(shipinspection);
    }
    @GetMapping("/shiporderdoc/{ID}")
    public ResponseEntity <shiporderdoc> getShipOrderDocByID(@PathVariable Integer ID) {
        shiporderdoc shiporderdoc=shiporderdocRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(shiporderdoc);
    }
    @GetMapping("/sort/{ID}")
    public ResponseEntity <sort> getSortByID(@PathVariable Integer ID) {
        sort sort=sortRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(sort);
    }
    @GetMapping("/temperature/{ID}")
    public ResponseEntity <temperature> getTemperatureByID(@PathVariable Integer ID) {
        temperature temperature=temperatureRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(temperature);
    }
    @GetMapping("/temperaturecheck/{ID}")
    public ResponseEntity <temperaturecheck> getTemperaturecheckByID(@PathVariable Integer ID) {
        temperaturecheck temperaturecheck=temperaturecheckRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(temperaturecheck);
    }
    @GetMapping("/unit/{ID}")
    public ResponseEntity <unit> getUnitByID(@PathVariable Integer ID) {
        unit unit=unitRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(unit);
    }
    @GetMapping("/usepage/{ID}")
    public ResponseEntity <usepage> getUsePageByID(@PathVariable Integer ID) {
        usepage usepage=usepageRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(usepage);
    }
    @GetMapping("/warehouse/{ID}")
    public ResponseEntity <warehouse> getWareHouseByID(@PathVariable Integer ID) {
        warehouse warehouse=warehouseRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(warehouse);
    }
    @GetMapping("/wash/{ID}")
    public ResponseEntity <wash> getWashByID(@PathVariable Integer ID) {
        wash wash=washRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(wash);
    }
    @GetMapping("/weight/{ID}")
    public ResponseEntity <weight> getWeightByID(@PathVariable Integer ID) {
        weight weight=weightRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(weight);
    }
    @GetMapping("/weight_rec/{ID}")
    public ResponseEntity <weight_rec> getWeight_recByID(@PathVariable Integer ID) {
        weight_rec weight_rec=weight_recRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(weight_rec);
    }
    @GetMapping("/worker/{ID}")
    public ResponseEntity <worker> getWorkerByID(@PathVariable Integer ID) {
        worker worker=workerRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(worker);
    }
    @GetMapping("/workorderdoc/{ID}")
    public ResponseEntity <workorderdoc> getWorkOrderDocByID(@PathVariable Integer ID) {
        workorderdoc workorderdoc=workorderdocRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(workorderdoc);
    }
    @GetMapping("/workperformance/{ID}")
    public ResponseEntity <workperformance> getWorkPerformanceByID(@PathVariable Integer ID) {
        workperformance workperformance=workperformanceRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(workperformance);
    }
    @GetMapping("/workstandard/{ID}")
    public ResponseEntity <workstandard> getWorkStandardByID(@PathVariable Integer ID) {
        workstandard workstandard=workstandardRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        return ResponseEntity.ok(workstandard);
    }
//PutMapping
    @PutMapping("/barcode/{ID}")
    public ResponseEntity <barcode> updateBarcode(@PathVariable Integer ID, @RequestBody barcode barcodeDetail) {
        barcode barcode=barcodeRepository.findById(ID)
            .orElseThrow(()->new RuntimeException("{ID}"));
        barcode.setBarcode((barcodeDetail.getBarcode()));
        barcode.setDevice((barcodeDetail.getDevice()));
        barcode.setID((barcodeDetail.getID()));
        barcode.setProductCode((barcodeDetail.getProductCode()));
        barcode.setProductName((barcodeDetail.getProductName()));
        barcode.setWriteDate((barcodeDetail.getWriteDate()));
        barcode updateBarcode = barcodeRepository.save(barcode);
        return ResponseEntity.ok(updateBarcode);
}
    @PutMapping("/bom/{ID}")
    public ResponseEntity <bom> updateBom(@PathVariable Integer ID, @RequestBody bom bomDetail) {
        bom bom=bomRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        bom.setID((bomDetail.getID()));
        bom.setProductCode((bomDetail.getProductCode()));
        bom.setBomName((bomDetail.getBomName()));
        bom.setBomcode((bomDetail.getBomcode()));
        bom.setMaterialBom((bomDetail.getMaterialBom()));
        bom.setDescription((bomDetail.getDescription()));
        bom.setQuantity((bomDetail.getQuantity()));
        bom.setRawPlus((bomDetail.getRawPlus()));
        bom.setWriteDate((bomDetail.getWriteDate()));
        bom.setWriter((bomDetail.getWriter()));
        bom.setUnit((bomDetail.getUnit()));
        bom.setSortCode((bomDetail.getSortCode()));
        bom.setMiddleMaterial((bomDetail.getMiddleMaterial()));
        bom updateBom = bomRepository.save(bom);
        return ResponseEntity.ok(updateBom);
    }
    @PutMapping("/client/{ID}")
    public ResponseEntity <client> updateClient(@PathVariable Integer ID, @RequestBody client clientDetail) {
        client client=clientRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        client.setAddress(clientDetail.getAddress());
        client.setID(clientDetail.getID());
        client.setCatery(clientDetail.getCatery());
        client.setClientCode(clientDetail.getClientCode());
        client.setClientName(clientDetail.getClientName());
        client.setCompanyNumber(clientDetail.getCompanyNumber());
        client.setDescription(clientDetail.getDescription());
        client.setDivision(clientDetail.getDivision());
        client.setEmail(clientDetail.getEmail());
        client.setFax(clientDetail.getFax());
        client.setManager(clientDetail.getManager());
        client.setPhoneNumber(clientDetail.getPhoneNumber());
        client.setRepresentative(clientDetail.getRepresentative());
        client.setWriteDate(clientDetail.getWriteDate());
        client.setWriter(clientDetail.getWriter());
        client.setZipCode(clientDetail.getZipCode());
        client updateClient = clientRepository.save(client);
        return ResponseEntity.ok(updateClient);
    }
    @PutMapping("/customer/{ID}")
    public ResponseEntity <customer> updateCustomer(@PathVariable Integer ID, @RequestBody customer customerDetail) {
        customer customer=customerRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        customer.setAddress(customerDetail.getAddress());
        customer.setCatery(customerDetail.getCatery());
        customer.setClientName(customerDetail.getClientName());
        customer.setClientCode(customerDetail.getClientCode());
        customer.setCompanyNumber(customerDetail.getCompanyNumber());
        customer.setDescription(customerDetail.getDescription());
        customer.setDivision(customerDetail.getDivision());
        customer.setEmail(customerDetail.getEmail());
        customer.setFax(customerDetail.getFax());
        customer.setManager(customerDetail.getManager());
        customer.setPhoneNumber(customerDetail.getPhoneNumber());
        customer.setRepresentative(customerDetail.getRepresentative());
        customer.setWriteDate(customerDetail.getWriteDate());
        customer.setWriter(customerDetail.getWriter());
        customer.setZipCode(customerDetail.getZipCode());
        customer.setID(customerDetail.getID());

        customer updateCustomer = customerRepository.save(customer);
        return ResponseEntity.ok(updateCustomer);
    }
    @PutMapping("/department/{ID}")
    public ResponseEntity <department> updateDepartment(@PathVariable Integer ID, @RequestBody department departmentDetail) {
        department department=departmentRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        department.setDepartmentCode((departmentDetail.getDepartmentCode()));
        department.setDepartmentName((departmentDetail.getDepartmentName()));
        department.setPosition((departmentDetail.getPosition()));
        department.setCompanyNumber((departmentDetail.getCompanyNumber()));
        department.setDescription((departmentDetail.getDescription()));
        department.setManager((departmentDetail.getManager()));
        department.setWriteDate((departmentDetail.getWriteDate()));
        department.setWriter((departmentDetail.getWriter()));
        department.setID((departmentDetail.getID()));
        department updateDepartment = departmentRepository.save(department);
        return ResponseEntity.ok(updateDepartment);
    }
    @PutMapping("/equipment/{ID}")
    public ResponseEntity <equipment> updateEquipment(@PathVariable Integer ID, @RequestBody equipment equipmentDetail) {
        equipment equipment=equipmentRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        equipment.setEqupmentCode(equipmentDetail.getEqupmentCode());
        equipment.setDescription(equipmentDetail.getDescription());
        equipment.setEquipmentDescription(equipmentDetail.getEquipmentDescription());
        equipment.setEquipmentManagers(equipmentDetail.getEquipmentManagers());
        equipment.setEquipmentManufacture(equipmentDetail.getEquipmentManufacture());
        equipment.setEquipmentQuantity(equipmentDetail.getEquipmentQuantity());
        equipment.setEquipmentSpecifications(equipmentDetail.getEquipmentSpecifications());
        equipment.setMainProducts(equipmentDetail.getMainProducts());
        equipment.setManufactureDate(equipmentDetail.getManufactureDate());
        equipment.setProcessName(equipmentDetail.getProcessName());
        equipment.setState(equipmentDetail.getState());
        equipment.setStateChangeDate(equipmentDetail.getStateChangeDate());
        equipment.setUsingDepartmentsEquipment(equipmentDetail.getUsingDepartmentsEquipment());
        equipment.setWriteDate(equipmentDetail.getWriteDate());
        equipment.setWriter(equipmentDetail.getWriter());
        equipment updateEquipment = equipmentRepository.save(equipment);
        return ResponseEntity.ok(updateEquipment);
    }
    @PutMapping("/equipmentchecklist/{ID}")
    public ResponseEntity <equipmentchecklist> updateEquipmentCheckList(@PathVariable Integer ID, @RequestBody equipmentchecklist equipmentchecklistDetail) {
        equipmentchecklist equipmentchecklist=equipmentchecklistRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        equipmentchecklist.setID(equipmentchecklistDetail.getID());
        equipmentchecklist.setEquipmentCode(equipmentchecklist.getEquipmentCode());
        equipmentchecklist.setInspectionName(equipmentchecklistDetail.getInspectionName());
        equipmentchecklist.setWriteDate(equipmentchecklistDetail.getWriteDate());
        equipmentchecklist.setWriter(equipmentchecklistDetail.getWriter());
        equipmentchecklist updateEquipmentCheckList = equipmentchecklistRepository.save(equipmentchecklist);
        return ResponseEntity.ok(updateEquipmentCheckList);
    }
    @PutMapping("/equipmentcheck/{ID}")
    public ResponseEntity <equipmentcheck> updateEquipmentCheck(@PathVariable Integer ID, @RequestBody equipmentcheck equipmentcheckDetail) {
        equipmentcheck equipmentcheck=equipmentcheckRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        equipmentcheck.setID(equipmentcheckDetail.getID());
        equipmentcheck.setCleanness(equipmentcheckDetail.getCleanness());
        equipmentcheck.setControlPart(equipmentcheckDetail.getControlPart());
        equipmentcheck.setDamage(equipmentcheckDetail.getDamage());
        equipmentcheck.setEquipmentCode(equipmentcheckDetail.getEquipmentCode());
        equipmentcheck.setPower(equipmentcheckDetail.getPower());
        equipmentcheck.setScrew(equipmentcheckDetail.getScrew());
        equipmentcheck.setWriter(equipmentcheckDetail.getWriter());
        equipmentcheck.setWriteDate(equipmentcheckDetail.getWriteDate());
        equipmentcheck updateEquipmentCheck = equipmentcheckRepository.save(equipmentcheck);
        return ResponseEntity.ok(updateEquipmentCheck);
    }
    @PutMapping("/equipmentinspection/{ID}")
    public ResponseEntity <equipmentinspection> updateEquipmentInspection(@PathVariable Integer ID, @RequestBody equipmentinspection equipmentinspectionDetail) {
        equipmentinspection equipmentinspection=equipmentinspectionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        equipmentinspection.setID(equipmentinspectionDetail.getID());
        equipmentinspection.setBroken(equipmentinspectionDetail.getBroken());
        equipmentinspection.setControll(equipmentinspectionDetail.getControll());
        equipmentinspection.setEquipmentCode(equipmentinspectionDetail.getEquipmentCode());
        equipmentinspection.setForeignBody(equipmentinspectionDetail.getForeignBody());
        equipmentinspection.setInspectionTime(equipmentinspectionDetail.getInspectionTime());
        equipmentinspection.setDescription(equipmentinspectionDetail.getDescription());
        equipmentinspection.setPower(equipmentinspectionDetail.getPower());
        equipmentinspection.setVolte(equipmentinspectionDetail.getVolte());
        equipmentinspection.setWriteDate(equipmentinspectionDetail.getWriteDate());
        equipmentinspection.setWriter(equipmentinspectionDetail.getWriter());
        equipmentinspection updateEquipmentInspection = equipmentinspectionRepository.save(equipmentinspection);
        return ResponseEntity.ok(updateEquipmentInspection);
    }
    @PutMapping("/equipmentprevention/{ID}")
    public ResponseEntity <equipmentprevention> updateEquipmentPrevention(@PathVariable Integer ID, @RequestBody equipmentprevention equipmentpreventionDetail) {
        equipmentprevention equipmentprevention=equipmentpreventionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        equipmentprevention.setID(equipmentpreventionDetail.getID());
        equipmentprevention.setCleanness(equipmentpreventionDetail.getCleanness());
        equipmentprevention.setControlPart(equipmentpreventionDetail.getControlPart());
        equipmentprevention.setDamage(equipmentpreventionDetail.getDamage());
        equipmentprevention.setEquipmentCode(equipmentpreventionDetail.getEquipmentCode());
        equipmentprevention.setPower(equipmentpreventionDetail.getPower());
        equipmentprevention.setScrew(equipmentpreventionDetail.getScrew());
        equipmentprevention.setWriter(equipmentpreventionDetail.getWriter());
        equipmentprevention.setWriteDate(equipmentpreventionDetail.getWriteDate());
        equipmentprevention updateEquipmentPrevention = equipmentpreventionRepository.save(equipmentprevention);
        return ResponseEntity.ok(updateEquipmentPrevention);
    }
    @PutMapping("/errorcode/{ID}")
    public ResponseEntity <errorcode> updateErrorCode(@PathVariable Integer ID, @RequestBody errorcode errorcodeDetail) {
        errorcode errorcode=errorcodeRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        errorcode.setErrorCode(errorcodeDetail.getErrorCode());
        errorcode.setID(errorcodeDetail.getID());
        errorcode.setErrorContents(errorcodeDetail.getErrorContents());
        errorcode.setErrorName(errorcodeDetail.getErrorName());
        errorcode.setDescription(errorcodeDetail.getDescription());
        errorcode.setWriteDate(errorcodeDetail.getWriteDate());
        errorcode.setWriter(errorcodeDetail.getWriter());
        errorcode updateErrorCode = errorcodeRepository.save(errorcode);
        return ResponseEntity.ok(updateErrorCode);
    }
    @PutMapping("/fileboard/{ID}")
    public ResponseEntity <fileboard> updateFileBoard(@PathVariable Integer ID, @RequestBody fileboard fileboardDetail) {
        fileboard fileboard=fileboardRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        fileboard.setID(fileboardDetail.getID());
        fileboard.setDocument(fileboardDetail.getDocument());
        fileboard.setCatery(fileboardDetail.getCatery());
        fileboard.setFileNumber(fileboardDetail.getFileNumber());
        fileboard.setTag(fileboardDetail.getTag());
        fileboard.setTitle(fileboardDetail.getTitle());
        fileboard.setDescription(fileboardDetail.getDescription());
        fileboard.setWriteDate(fileboardDetail.getWriteDate());
        fileboard.setWriter(fileboardDetail.getWriter());
        fileboard updateFileBoard = fileboardRepository.save(fileboard);
        return ResponseEntity.ok(updateFileBoard);
    }
    @PutMapping("/filter/{ID}")
    public ResponseEntity <filter> updateFilter(@PathVariable Integer ID, @RequestBody filter filterDetail) {
        filter filter=filterRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        filter.setID(filterDetail.getID());
        filter.setChecker(filterDetail.getChecker());
        filter.setFiltering(filterDetail.getFiltering());
        filter.setImproving(filterDetail.getImproving());
        filter.setInspectionTime(filterDetail.getInspectionTime());
        filter.setMatter(filterDetail.getMatter());
        filter.setDescription(filterDetail.getDescription());
        filter.setProblem(filterDetail.getProblem());
        filter.setProductCode(filterDetail.getProductCode());
        filter.setManager(filterDetail.getManager());
        filter.setWriteDate(filterDetail.getWriteDate());
        filter.setWriter(filterDetail.getWriter());

        filter updateFilter = filterRepository.save(filter);
        return ResponseEntity.ok(updateFilter);
    }
    @PutMapping("/heating/{ID}")
    public ResponseEntity <heating> updateHeating(@PathVariable Integer ID, @RequestBody heating heatingDetail) {
        heating heating=heatingRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        heating.setChecker(heatingDetail.getChecker());
        heating.setEndtime(heatingDetail.getEndtime());
        heating.setImproving(heatingDetail.getImproving());
        heating.setKettle(heatingDetail.getKettle());
        heating.setProblem(heatingDetail.getProblem());
        heating.setDescription(heatingDetail.getDescription());
        heating.setSauceEndTem(heatingDetail.getSauceEndTem());
        heating.setSauceStartTem(heatingDetail.getSauceStartTem());
        heating.setStartTime(heatingDetail.getStartTime());
        heating.setManager(heatingDetail.getManager());
        heating.setWriteDate(heatingDetail.getWriteDate());
        heating.setWriter(heatingDetail.getWriter());
        heating.setID(heatingDetail.getID());
        heating updateHeating = heatingRepository.save(heating);
        return ResponseEntity.ok(updateHeating);
    }
    @PutMapping("/inventory/{ID}")
    public ResponseEntity <inventory> updateInventory(@PathVariable Integer ID, @RequestBody inventory inventoryDetail) {
        inventory inventory=inventoryRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        inventory.setCarryover(inventoryDetail.getCarryover());
        inventory.setID(inventoryDetail.getID());
        inventory.setInventoryLOT(inventoryDetail.getInventoryLOT());
        inventory.setMaterialCode(inventoryDetail.getMaterialCode());
        inventory.setPackBarrel(inventoryDetail.getPackBarrel());
        inventory.setProcess(inventoryDetail.getProcess());
        inventory.setProductCode(inventoryDetail.getProductCode());
        inventory.setQuantity(inventoryDetail.getQuantity());
        inventory.setRawMaterialLOT(inventoryDetail.getRawMaterialLOT());
        inventory.setRemainder(inventoryDetail.getRemainder());
        inventory.setShipOrderDocNumber(inventoryDetail.getShipOrderDocNumber());
        inventory.setTagForm(inventoryDetail.getTagForm());
        inventory.setTagTo(inventoryDetail.getTagTo());
        inventory.setWriteDate(inventoryDetail.getWriteDate());
        inventory.setWriter(inventoryDetail.getWriter());
        inventory.setWorkOderDocNumber(inventoryDetail.getWorkOderDocNumber());
        inventory updateInventory = inventoryRepository.save(inventory);
        return ResponseEntity.ok(updateInventory);
    }
    @PutMapping("/lavorer/{ID}")
    public ResponseEntity <lavorer> updateLavoer(@PathVariable Integer ID, @RequestBody lavorer lavorerDetail) {
        lavorer lavorer=lavorerRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        lavorer.setID(lavorerDetail.getID());
        lavorer.setCountry(lavorerDetail.getCountry());
        lavorer.setHiredate(lavorerDetail.getHiredate());
        lavorer.setLavorerCode(lavorerDetail.getLavorerCode());
        lavorer.setMemberType(lavorerDetail.getMemberType());
        lavorer.setNightShift(lavorerDetail.getNightShift());
        lavorer.setDescription(lavorerDetail.getDescription());
        lavorer.setPosition(lavorerDetail.getPosition());
        lavorer.setProcessName(lavorerDetail.getProcessName());
        lavorer.setSpot(lavorerDetail.getSpot());
        lavorer.setWorkerCode(lavorerDetail.getWorkerCode());
        lavorer.setWorkingTime(lavorerDetail.getWorkingTime());
        lavorer.setWriteDate(lavorerDetail.getWriteDate());
        lavorer.setWriter(lavorerDetail.getWriter());
        lavorer updateLavoer = lavorerRepository.save(lavorer);
        return ResponseEntity.ok(updateLavoer);
    }
    @PutMapping("/loginlog/{ID}")
    public ResponseEntity <loginlog> updateLoginLog(@PathVariable Integer ID, @RequestBody loginlog loginlogDetail) {
        loginlog loginlog=loginlogRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        loginlog.setID(loginlogDetail.getID());
        loginlog.setEndLogin(loginlogDetail.getEndLogin());
        loginlog.setFailCount(loginlogDetail.getFailCount());
        loginlog.setIPAdress(loginlogDetail.getIPAdress());
        loginlog.setStartLogin(loginlogDetail.getStartLogin());
        loginlog.setWorkerCode(loginlogDetail.getWorkerCode());
        loginlog updateLoginLog = loginlogRepository.save(loginlog);
        return ResponseEntity.ok(updateLoginLog);
    }
    @PutMapping("/materialmove/{ID}")
    public ResponseEntity <materialmove> updateMaterialMove(@PathVariable Integer ID, @RequestBody materialmove materialmoveDetail) {
        materialmove materialmove=materialmoveRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        materialmove.setID(materialmoveDetail.getID());
        materialmove.setCode(materialmoveDetail.getCode());
        materialmove.setErrorCode(materialmoveDetail.getErrorCode());
        materialmove.setInstructionKind(materialmoveDetail.getInstructionKind());
        materialmove.setInstructionNumber(materialmoveDetail.getInstructionNumber());
        materialmove.setOriginalQuantity(materialmoveDetail.getOriginalQuantity());
        materialmove.setDescription(materialmoveDetail.getDescription());
        materialmove.setQuantity(materialmoveDetail.getQuantity());
        materialmove.setTagFrom(materialmoveDetail.getTagFrom());
        materialmove.setTagTo(materialmoveDetail.getTagTo());
        materialmove.setManager(materialmoveDetail.getManager());
        materialmove.setPhoneNumber(materialmoveDetail.getPhoneNumber());
        materialmove.setRepresentative(materialmoveDetail.getRepresentative());
        materialmove.setWriteDate(materialmoveDetail.getWriteDate());
        materialmove.setWriter(materialmoveDetail.getWriter());
        materialmove.setZipCode(materialmoveDetail.getZipCode());
        materialmove updateMaterialMove = materialmoveRepository.save(materialmove);
        return ResponseEntity.ok(updateMaterialMove);
    }
    @PutMapping("/noticeboard/{ID}")
    public ResponseEntity <noticeboard> updateNoticeBoard(@PathVariable Integer ID, @RequestBody noticeboard noticeboardDetail) {
        noticeboard noticeboard=noticeboardRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        noticeboard.setGuideDocument(noticeboardDetail.getGuideDocument());
        noticeboard.setLocation(noticeboardDetail.getLocation());
        noticeboard.setPreview(noticeboardDetail.getPreview());
        noticeboard.setSubtitle(noticeboardDetail.getSubtitle());
        noticeboard.setTitle(noticeboardDetail.getTitle());
        noticeboard.setToDo(noticeboardDetail.getToDo());
        noticeboard.setWhen(noticeboardDetail.getWhen());
        noticeboard.setWhere(noticeboardDetail.getWhere());
        noticeboard.setWho(noticeboardDetail.getWho());
        noticeboard.setManager(noticeboardDetail.getManager());
        noticeboard.setWriteDate(noticeboardDetail.getWriteDate());
        noticeboard.setWriter(noticeboardDetail.getWriter());
        noticeboard.setID(noticeboardDetail.getID());
        noticeboard updateNoticeBoard = noticeboardRepository.save(noticeboard);
        return ResponseEntity.ok(updateNoticeBoard);
    }
    @PutMapping("/orderdoc/{ID}")
    public ResponseEntity <orderdoc> updateOrderDoc(@PathVariable Integer ID, @RequestBody orderdoc orderdocDetail) {
        orderdoc orderdoc=orderdocRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        orderdoc.setClientCompany(orderdocDetail.getClientCompany());
        orderdoc.setConfirmMan(orderdocDetail.getConfirmMan());
        orderdoc.setContactPrice(orderdocDetail.getContactPrice());
        orderdoc.setDeliveryCondition(orderdocDetail.getDeliveryCondition());
        orderdoc.setListPrice(orderdocDetail.getListPrice());
        orderdoc.setDescription(orderdocDetail.getDescription());
        orderdoc.setMoneyUnit(orderdocDetail.getMoneyUnit());
        orderdoc.setOrderDate(orderdocDetail.getOrderDate());
        orderdoc.setOrderDocNumber(orderdocDetail.getOrderDocNumber());
        orderdoc.setManager(orderdocDetail.getManager());
        orderdoc.setState(orderdocDetail.getState());
        orderdoc.setUnitePrice(orderdocDetail.getUnitePrice());
        orderdoc.setWriteDate(orderdocDetail.getWriteDate());
        orderdoc.setWriter(orderdocDetail.getWriter());
        orderdoc.setWorkplace(orderdocDetail.getWorkplace());
        orderdoc.setID(orderdocDetail.getID());
        orderdoc updateOrderDoc = orderdocRepository.save(orderdoc);
        return ResponseEntity.ok(updateOrderDoc);
    }
    @PutMapping("/orders/{ID}")
    public ResponseEntity <orders> updateOrders(@PathVariable Integer ID, @RequestBody orders ordersDetail) {
        orders orders=ordersRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        orders.setID(ordersDetail.getID());
        orders.setDeliveryDueDate(ordersDetail.getDeliveryDueDate());
        orders.setOrderDate(ordersDetail.getOrderDate());
        orders.setOrderDocNumber(ordersDetail.getOrderDocNumber());
        orders.setProductCode(ordersDetail.getProductCode());
        orders.setQuantity(ordersDetail.getQuantity());
        orders.setRemainder(ordersDetail.getRemainder());
        orders.setState(ordersDetail.getState());
        orders.setUnit(ordersDetail.getUnit());
        orders updateOrders = ordersRepository.save(orders);
        return ResponseEntity.ok(updateOrders);
    }
    @PutMapping("/ordersheet/{ID}")
    public ResponseEntity <ordersheet> updateOrderSheet(@PathVariable Integer ID, @RequestBody ordersheet ordersheetDetail) {
        ordersheet ordersheet=ordersheetRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        ordersheet.setID(ordersheetDetail.getID());
        ordersheet.setAAddress(ordersheetDetail.getAAddress());
        ordersheet.setAHP(ordersheetDetail.getAHP());
        ordersheet.setApplicant(ordersheetDetail.getApplicant());
        ordersheet.setATell(ordersheetDetail.getATell());
        ordersheet.setOderSheetCode(ordersheetDetail.getOderSheetCode());
        ordersheet.setDescription(ordersheetDetail.getDescription());
        ordersheet.setPayer(ordersheetDetail.getPayer());
        ordersheet.setPrice(ordersheetDetail.getPrice());
        ordersheet.setProductCode(ordersheetDetail.getProductCode());
        ordersheet.setQuantity(ordersheetDetail.getQuantity());
        ordersheet.setRAdress(ordersheetDetail.getRAdress());
        ordersheet.setRecipent(ordersheetDetail.getRecipent());
        ordersheet.setWriteDate(ordersheetDetail.getWriteDate());
        ordersheet.setWriter(ordersheetDetail.getWriter());
        ordersheet.setRemainder(ordersheetDetail.getRemainder());
        ordersheet.setRHP(ordersheetDetail.getRHP());
        ordersheet.setRTell(ordersheetDetail.getRTell());
        ordersheet updateOrderSheet = ordersheetRepository.save(ordersheet);
        return ResponseEntity.ok(updateOrderSheet);
    }
    @PutMapping("/placeorderdoc/{ID}")
    public ResponseEntity <placeorderdoc> updatePlaceOrderDoc(@PathVariable Integer ID, @RequestBody placeorderdoc placeorderdocDetail) {
        placeorderdoc placeorderdoc=placeorderdocRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        placeorderdoc.setID(placeorderdocDetail.getID());
        placeorderdoc.setClientCompany(placeorderdocDetail.getClientCompany());
        placeorderdoc.setConfirmMan(placeorderdocDetail.getConfirmMan());
        placeorderdoc.setContactPrice(placeorderdocDetail.getContactPrice());
        placeorderdoc.setDeliveryCondition(placeorderdocDetail.getDeliveryCondition());
        placeorderdoc.setListPrice(placeorderdocDetail.getListPrice());
        placeorderdoc.setDescription(placeorderdocDetail.getDescription());
        placeorderdoc.setManager(placeorderdocDetail.getManager());
        placeorderdoc.setMoneyUnit(placeorderdocDetail.getMoneyUnit());
        placeorderdoc.setWorkplace(placeorderdocDetail.getWorkplace());
        placeorderdoc.setPlaceOderDate(placeorderdocDetail.getPlaceOderDate());
        placeorderdoc.setPlaceOrderDoNumber(placeorderdocDetail.getPlaceOrderDoNumber());
        placeorderdoc.setPlaceOrderNumber(placeorderdocDetail.getPlaceOrderNumber());
        placeorderdoc.setWriteDate(placeorderdocDetail.getWriteDate());
        placeorderdoc.setWriter(placeorderdocDetail.getWriter());
        placeorderdoc.setState(placeorderdocDetail.getState());
        placeorderdoc.setUnitPrice(placeorderdocDetail.getUnitPrice());
        placeorderdoc updatePlaceOrderDoc = placeorderdocRepository.save(placeorderdoc);
        return ResponseEntity.ok(updatePlaceOrderDoc);
    }
    @PutMapping("/placeorders/{ID}")
    public ResponseEntity <placeorders> updatePlaceOrders(@PathVariable Integer ID, @RequestBody placeorders placeordersDetail) {
        placeorders placeorders=placeordersRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        placeorders.setID(placeordersDetail.getID());
        placeorders.setMaterialCode(placeordersDetail.getMaterialCode());
        placeorders.setQuantity(placeordersDetail.getQuantity());
        placeorders.setPlaceOrderDate(placeordersDetail.getPlaceOrderDate());
        placeorders.setPlaceOrderDoNumber(placeordersDetail.getPlaceOrderDoNumber());
        placeorders.setPlaceOrderNumber(placeordersDetail.getPlaceOrderNumber());
        placeorders.setReceiveDueDate(placeordersDetail.getReceiveDueDate());
        placeorders.setState(placeordersDetail.getState());
        placeorders.setStorage(placeordersDetail.getStorage());
        placeorders.setUnit(placeordersDetail.getUnit());
        placeorders.setWarehouse(placeordersDetail.getWarehouse());
        placeorders.setWeight(placeordersDetail.getWeight());
        placeorders.setRemainder(placeordersDetail.getRemainder());
        placeorders updatePlaceOrders = placeordersRepository.save(placeorders);
        return ResponseEntity.ok(updatePlaceOrders);
    }
    @PutMapping("/position/{ID}")
    public ResponseEntity <position> updatePosition(@PathVariable Integer ID, @RequestBody position positionDetail) {
        position position=positionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        position.setID(positionDetail.getID());
        position.setNamePosition(positionDetail.getNamePosition());
        position.setPositionCode(positionDetail.getPositionCode());
        position.setDescription(positionDetail.getDescription());
        position.setWriteDate(positionDetail.getWriteDate());
        position.setWriter(positionDetail.getWriter());
        position updatePosition = positionRepository.save(position);
        return ResponseEntity.ok(updatePosition);
    }
    @PutMapping("/process/{ID}")
    public ResponseEntity <process> updateProcess(@PathVariable Integer ID, @RequestBody process processDetail) {
        process process=processRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        process.setDocument(processDetail.getDocument());
        process.setEquipmentCode(processDetail.getEquipmentCode());
        process.setFinalProcess(processDetail.getFinalProcess());
        process.setGuideDocument(processDetail.getGuideDocument());
        process.setInspectionName(processDetail.getInspectionName());
        process.setDescription(processDetail.getDescription());
        process.setManager(processDetail.getManager());
        process.setOutputHour(processDetail.getOutputHour());
        process.setOutputMinute(processDetail.getOutputMinute());
        process.setProcessCode(processDetail.getProcessCode());
        process.setProcessName(processDetail.getProcessName());
        process.setProductionUnit(processDetail.getProductionUnit());
        process.setWriteDate(processDetail.getWriteDate());
        process.setWriter(processDetail.getWriter());
        process.setSortName(processDetail.getSortName());
        process.setWarehouse(processDetail.getWarehouse());
        process.setID(processDetail.getID());
        process updateProcess = processRepository.save(process);
        return ResponseEntity.ok(updateProcess);
    }
    @PutMapping("/processchart/{ID}")
    public ResponseEntity <processchart> updateProcessChart(@PathVariable Integer ID, @RequestBody processchart processchartDetail) {
        processchart processchart=processchartRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        processchart.setID(processchartDetail.getID());
        processchart.setBOMCode(processchartDetail.getBOMCode());
        processchart.setGuideDocument(processchartDetail.getGuideDocument());
        processchart.setProcessChartCode(processchartDetail.getProcessChartCode());
        processchart.setProcessCode(processchartDetail.getProcessCode());
        processchart.setProcessName(processchartDetail.getProcessName());
        processchart.setSortCode(processchartDetail.getSortCode());
        processchart.setWriteDate(processchartDetail.getWriteDate());
        processchart.setWriter(processchartDetail.getWriter());
        processchart updateProcessChart = processchartRepository.save(processchart);
        return ResponseEntity.ok(updateProcessChart);
    }
    @PutMapping("/processcode/{ID}")
    public ResponseEntity <processcode> updateProcessCode(@PathVariable Integer ID, @RequestBody processcode processcodeDetail) {
        processcode processcode=processcodeRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        processcode.setID(processcodeDetail.getID());
        processcode.setProcessCode(processcodeDetail.getProcessCode());
        processcode.setProcessName(processcodeDetail.getProcessName());
        processcode.setDescription(processcodeDetail.getDescription());
        processcode.setWriteDate(processcodeDetail.getWriteDate());
        processcode.setWriter(processcodeDetail.getWriter());
        processcode updateProcessCode = processcodeRepository.save(processcode);
        return ResponseEntity.ok(updateProcessCode);
    }
    @PutMapping("/product/{ID}")
    public ResponseEntity <product> updateProduct(@PathVariable Integer ID, @RequestBody product productDetail) {
        product product=productRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        product.setID(productDetail.getID());
        product.setBundle(productDetail.getBundle());
        product.setIcePack(productDetail.getIcePack());
        product.setPacking(productDetail.getPacking());
        product.setShipping(productDetail.getShipping());
        product.setSortName(productDetail.getSortName());
        product.setDescription(productDetail.getDescription());
        product.setStorage(productDetail.getStorage());
        product.setPrice(productDetail.getPrice());
        product.setProductCode(productDetail.getProductCode());
        product.setQuantity(productDetail.getQuantity());
        product.setStorageTerm(productDetail.getStorageTerm());
        product.setUnit(productDetail.getUnit());
        product.setWriteDate(productDetail.getWriteDate());
        product.setWriter(productDetail.getWriter());
        product.setUnitPrice(productDetail.getUnitPrice());
        product updateProduct = productRepository.save(product);
        return ResponseEntity.ok(updateProduct);
    }
    @PutMapping("/productcorrect/{ID}")
    public ResponseEntity <productcorrect> updateProductCorrect(@PathVariable Integer ID, @RequestBody productcorrect productcorrectDetail) {
        productcorrect productcorrect=productcorrectRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        productcorrect.setID(productcorrectDetail.getID());
        productcorrect.setChangeQuantity(productcorrectDetail.getChangeQuantity());
        productcorrect.setReason(productcorrectDetail.getReason());
        productcorrect.setProductCode(productcorrectDetail.getProductCode());
        productcorrect.setQuantity(productcorrectDetail.getQuantity());
        productcorrect.setWriteDate(productcorrectDetail.getWriteDate());
        productcorrect.setWriter(productcorrectDetail.getWriter());
        productcorrect updateProductCorrect = productcorrectRepository.save(productcorrect);
        return ResponseEntity.ok(updateProductCorrect);
    }
    @PutMapping("/producthistory/{ID}")
    public ResponseEntity <producthistory> updateProductHistory(@PathVariable Integer ID, @RequestBody producthistory producthistoryDetail) {
        producthistory producthistory=producthistoryRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        producthistory.setID(producthistoryDetail.getID());
        producthistory.setCarryover(producthistoryDetail.getCarryover());
        producthistory.setChangeReason(producthistoryDetail.getChangeReason());
        producthistory.setRealRetention(producthistoryDetail.getRealRetention());
        producthistory.setVarianceQuantity(producthistoryDetail.getVarianceQuantity());
        producthistory.setOderSheetCode(producthistoryDetail.getOderSheetCode());
        producthistory.setProductCode(producthistoryDetail.getProductCode());
        producthistory.setWriteDate(producthistoryDetail.getWriteDate());
        producthistory.setWriter(producthistoryDetail.getWriter());
        producthistory updateProductHistory = producthistoryRepository.save(producthistory);
        return ResponseEntity.ok(updateProductHistory);
    }
    @PutMapping("/productmove/{ID}")
    public ResponseEntity <productmove> updateProductMove(@PathVariable Integer ID, @RequestBody productmove productmoveDetail) {
        productmove productmove=productmoveRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        productmove.setID(productmoveDetail.getID());
        productmove.setCangeID(productmoveDetail.getCangeID());
        productmove.setErrorCode(productmoveDetail.getErrorCode());
        productmove.setMetarialCode(productmoveDetail.getMetarialCode());
        productmove.setO_Quantity(productmoveDetail.getO_Quantity());
        productmove.setPlaceOrderNumber(productmoveDetail.getPlaceOrderNumber());
        productmove.setTagFrom(productmoveDetail.getTagFrom());
        productmove.setTagTo(productmoveDetail.getTagTo());
        productmove.setWorkOrderDocNumber(productmoveDetail.getWorkOrderDocNumber());
        productmove.setProductCode(productmoveDetail.getProductCode());
        productmove.setQuantity(productmoveDetail.getQuantity());
        productmove.setWriteDate(productmoveDetail.getWriteDate());
        productmove.setWriter(productmoveDetail.getWriter());
        productmove updateProductMove = productmoveRepository.save(productmove);
        return ResponseEntity.ok(updateProductMove);
    }
    @PutMapping("/productreturn/{ID}")
    public ResponseEntity <productreturn> updateProductReturn(@PathVariable Integer ID, @RequestBody productreturn productreturnDetail) {
        productreturn productreturn=productreturnRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        productreturn.setID(productreturnDetail.getID());
        productreturn.setClient(productreturnDetail.getClient());
        productreturn.setManager(productreturnDetail.getManager());
        productreturn.setProductName(productreturnDetail.getProductName());
        productreturn.setResult(productreturnDetail.getResult());
        productreturn.setReturnDate(productreturnDetail.getReturnDate());
        productreturn.setDescription(productreturnDetail.getDescription());
        productreturn.setReturnReason(productreturnDetail.getReturnReason());
        productreturn.setShipOrderDoNumber(productreturnDetail.getShipOrderDoNumber());
        productreturn.setQuantity(productreturnDetail.getQuantity());
        productreturn.setWriteDate(productreturnDetail.getWriteDate());
        productreturn.setWriter(productreturnDetail.getWriter());
        productreturn updateProductReturn = productreturnRepository.save(productreturn);
        return ResponseEntity.ok(updateProductReturn);
    }
    @PutMapping("/qainspection/{ID}")
    public ResponseEntity <qainspection> updateQAInspection(@PathVariable Integer ID, @RequestBody qainspection qainspectionDetail) {
        qainspection qainspection=qainspectionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        qainspection.setID(qainspectionDetail.getID());
        qainspection.setErrorCode(qainspectionDetail.getErrorCode());
        qainspection.setMaterialCode(qainspectionDetail.getMaterialCode());
        qainspection.setProcess(qainspectionDetail.getProcess());
        qainspection.setQAInspection(qainspectionDetail.getQAInspection());
        qainspection.setResult(qainspectionDetail.getResult());
        qainspection.setDescription(qainspectionDetail.getDescription());
        qainspection.setSortName(qainspectionDetail.getSortName());
        qainspection.setTagFrom(qainspectionDetail.getTagFrom());
        qainspection.setProductCode(qainspectionDetail.getProductCode());
        qainspection.setQuantity(qainspectionDetail.getQuantity());
        qainspection.setTagTo(qainspectionDetail.getTagTo());
        qainspection.setWorkOrderDocNumber(qainspectionDetail.getWorkOrderDocNumber());
        qainspection.setWriteDate(qainspectionDetail.getWriteDate());
        qainspection.setWriter(qainspectionDetail.getWriter());
        qainspection updateQAInspection = qainspectionRepository.save(qainspection);
        return ResponseEntity.ok(updateQAInspection);
    }
    @PutMapping("/qaproduct/{ID}")
    public ResponseEntity <qaproduct> updateQAproduct(@PathVariable Integer ID, @RequestBody qaproduct qaproductDetail) {
        qaproduct qaproduct=qaproductRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        qaproduct.setID(qaproductDetail.getID());
        qaproduct.setClient(qaproductDetail.getClient());
        qaproduct.setManager(qaproductDetail.getManager());
        qaproduct.setQACode(qaproductDetail.getQACode());
        qaproduct.setDescription(qaproductDetail.getDescription());
        qaproduct.setProductCode(qaproductDetail.getProductCode());
        qaproduct.setWriteDate(qaproductDetail.getWriteDate());
        qaproduct.setWriter(qaproductDetail.getWriter());
        qaproduct updateQAproduct = qaproductRepository.save(qaproduct);
        return ResponseEntity.ok(updateQAproduct);
    }
    @PutMapping("/rawhistory/{ID}")
    public ResponseEntity <rawhistory> updateRawHistory(@PathVariable Integer ID, @RequestBody rawhistory rawhistoryDetail) {
        rawhistory rawhistory=rawhistoryRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        rawhistory.setID(rawhistoryDetail.getID());
        rawhistory.setCarryover(rawhistoryDetail.getCarryover());
        rawhistory.setChangeReason(rawhistoryDetail.getChangeReason());
        rawhistory.setDisposalQuantity(rawhistoryDetail.getDisposalQuantity());
        rawhistory.setMaterialCode(rawhistoryDetail.getMaterialCode());
        rawhistory.setRealRetention(rawhistoryDetail.getRealRetention());
        rawhistory.setReturnQuantity(rawhistoryDetail.getReturnQuantity());
        rawhistory.setVarianceQuantity(rawhistoryDetail.getVarianceQuantity());
        rawhistory.setWriteDate(rawhistoryDetail.getWriteDate());
        rawhistory.setWriter(rawhistoryDetail.getWriter());
        rawhistory updateRawHistory = rawhistoryRepository.save(rawhistory);
        return ResponseEntity.ok(updateRawHistory);
    }
    @PutMapping("/rawinspection/{ID}")
    public ResponseEntity <rawinspection> updateRawInspection(@PathVariable Integer ID, @RequestBody rawinspection rawinspectionDetail) {
        rawinspection rawinspection=rawinspectionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        rawinspection.setID(rawinspectionDetail.getID());
        rawinspection.setForeignBody(rawinspectionDetail.getForeignBody());
        rawinspection.setFresh(rawinspectionDetail.getFresh());
        rawinspection.setMaterialCode(rawinspectionDetail.getMaterialCode());
        rawinspection.setMaterialTemperature(rawinspectionDetail.getMaterialTemperature());
        rawinspection.setOutside(rawinspectionDetail.getOutside());
        rawinspection.setDescription(rawinspectionDetail.getDescription());
        rawinspection.setPacking(rawinspectionDetail.getPacking());
        rawinspection.setReceiptDate(rawinspectionDetail.getReceiptDate());
        rawinspection.setSmell(rawinspectionDetail.getSmell());
        rawinspection.setWriteDate(rawinspectionDetail.getWriteDate());
        rawinspection.setWriter(rawinspectionDetail.getWriter());
        rawinspection updateRawInspection = rawinspectionRepository.save(rawinspection);
        return ResponseEntity.ok(updateRawInspection);
    }
    @PutMapping("/rawmaterial/{ID}")
    public ResponseEntity <rawmaterial> updateRawMaterial(@PathVariable Integer ID, @RequestBody rawmaterial rawmaterialDetail) {
        rawmaterial rawmaterial=rawmaterialRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        rawmaterial.setID(rawmaterialDetail.getID());
        rawmaterial.setCarryover(rawmaterialDetail.getCarryover());
        rawmaterial.setMaterialCode(rawmaterialDetail.getMaterialCode());
        rawmaterial.setPlaceOrderNumber(rawmaterialDetail.getPlaceOrderNumber());
        rawmaterial.setRawMaterialLOT(rawmaterialDetail.getRawMaterialLOT());
        rawmaterial.setTagFrom(rawmaterialDetail.getTagFrom());
        rawmaterial.setTagTo(rawmaterialDetail.getTagTo());
        rawmaterial.setQuantity(rawmaterialDetail.getQuantity());
        rawmaterial.setWriteDate(rawmaterialDetail.getWriteDate());
        rawmaterial.setWriter(rawmaterialDetail.getWriter());
        rawmaterial.setRemainder(rawmaterialDetail.getRemainder());
        rawmaterial updateRawMaterial = rawmaterialRepository.save(rawmaterial);
        return ResponseEntity.ok(updateRawMaterial);
    }
    @PutMapping("/rawmaterialmaster/{ID}")
    public ResponseEntity <rawmaterialmaster> updateRawmaterialMaster(@PathVariable Integer ID, @RequestBody rawmaterialmaster rawmaterialmasterDetail) {
        rawmaterialmaster rawmaterialmaster=rawmaterialmasterRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        rawmaterialmaster.setID(rawmaterialmasterDetail.getID());
        rawmaterialmaster.setClientCompany(rawmaterialmasterDetail.getClientCompany());
        rawmaterialmaster.setMaterialCode(rawmaterialmasterDetail.getMaterialCode());
        rawmaterialmaster.setMaterialName(rawmaterialmasterDetail.getMaterialName());
        rawmaterialmaster.setOrigin(rawmaterialmasterDetail.getOrigin());
        rawmaterialmaster.setQuantitiyUnit(rawmaterialmasterDetail.getQuantitiyUnit());
        rawmaterialmaster.setDescription(rawmaterialmasterDetail.getDescription());
        rawmaterialmaster.setReverse(rawmaterialmasterDetail.getReverse());
        rawmaterialmaster.setSortation(rawmaterialmasterDetail.getSortation());
        rawmaterialmaster.setStorage(rawmaterialmasterDetail.getStorage());
        rawmaterialmaster.setQuantity(rawmaterialmasterDetail.getQuantity());
        rawmaterialmaster.setStorageTerm(rawmaterialmasterDetail.getStorageTerm());
        rawmaterialmaster.setTemperature(rawmaterialmasterDetail.getTemperature());
        rawmaterialmaster.setWriteDate(rawmaterialmasterDetail.getWriteDate());
        rawmaterialmaster.setWriter(rawmaterialmasterDetail.getWriter());
        rawmaterialmaster.setUnit(rawmaterialmasterDetail.getUnit());
        rawmaterialmaster.setUnitPrice(rawmaterialmasterDetail.getUnitPrice());
        rawmaterialmaster.setWeight(rawmaterialmasterDetail.getWeight());
        rawmaterialmaster updateRawmaterialMaster = rawmaterialmasterRepository.save(rawmaterialmaster);
        return ResponseEntity.ok(updateRawmaterialMaster);
    }
    @PutMapping("/rawmaterialtag/{ID}")
    public ResponseEntity <rawmaterialtag> updateRawMaterialtag(@PathVariable Integer ID, @RequestBody rawmaterialtag rawmaterialtagDetail) {
        rawmaterialtag rawmaterialtag=rawmaterialtagRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        rawmaterialtag.setID(rawmaterialtagDetail.getID());
        rawmaterialtag.setMaterialCode(rawmaterialtagDetail.getMaterialCode());
        rawmaterialtag.setPlaceOrderNumber(rawmaterialtagDetail.getPlaceOrderNumber());
        rawmaterialtag.setPlaceQuantity(rawmaterialtagDetail.getPlaceQuantity());
        rawmaterialtag.setRawMaterialLOT(rawmaterialtagDetail.getRawMaterialLOT());
        rawmaterialtag.setState(rawmaterialtagDetail.getState());
        rawmaterialtag.setTagNumber(rawmaterialtagDetail.getTagNumber());
        rawmaterialtag.setQuantity(rawmaterialtagDetail.getQuantity());
        rawmaterialtag.setWriteDate(rawmaterialtagDetail.getWriteDate());
        rawmaterialtag.setWriter(rawmaterialtagDetail.getWriter());
        rawmaterialtag.setRemainder(rawmaterialtagDetail.getRemainder());
        rawmaterialtag updateRawMaterialtag = rawmaterialtagRepository.save(rawmaterialtag);
        return ResponseEntity.ok(updateRawMaterialtag);
    }
    @PutMapping("/rfid/{ID}")
    public ResponseEntity <rfid> updateD(@PathVariable Integer ID, @RequestBody rfid rfidDetail) {
        rfid rfid=rfidRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        rfid.setID(rfidDetail.getID());
        rfid.setDeviceNum(rfidDetail.getDeviceNum());
        rfid.setPlace(rfidDetail.getPlace());
        rfid.setPort(rfidDetail.getPort());
        rfid.setRFID(rfidDetail.getRFID());
        rfid.setWriteDate(rfidDetail.getWriteDate());
        rfid updateD = rfidRepository.save(rfid);
        return ResponseEntity.ok(updateD);
    }
    @PutMapping("/rfid_barrel/{ID}")
    public ResponseEntity <rfid_barrel> updateRFID_Barrel(@PathVariable Integer ID, @RequestBody rfid_barrel rfid_barrelDetail) {
        rfid_barrel rfid_barrel=rfid_barrelRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        rfid_barrel.setID(rfid_barrelDetail.getID());
        rfid_barrel.setBarrel(rfid_barrelDetail.getBarrel());
        rfid_barrel.setRFID(rfid_barrelDetail.getRFID());
        rfid_barrel.setWriteDate(rfid_barrelDetail.getWriteDate());
        rfid_barrel.setWriter(rfid_barrelDetail.getWriter());
        rfid_barrel updateRFID_Barrel = rfid_barrelRepository.save(rfid_barrel);
        return ResponseEntity.ok(updateRFID_Barrel);
    }
    @PutMapping("/setplus/{ID}")
    public ResponseEntity <setplus> updateSetPlus(@PathVariable Integer ID, @RequestBody setplus setplusDetail) {
        setplus setplus=setplusRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        setplus.setID(setplusDetail.getID());
        setplus.setSetProduct(setplusDetail.getSetProduct());
        setplus.setSetQuantity(setplusDetail.getSetQuantity());
        setplus.setProductCode(setplusDetail.getProductCode());
        setplus.setQuantity(setplusDetail.getQuantity());
        setplus.setWriteDate(setplusDetail.getWriteDate());
        setplus.setWriter(setplusDetail.getWriter());
        setplus updateSetPlus = setplusRepository.save(setplus);
        return ResponseEntity.ok(updateSetPlus);
    }
    @PutMapping("/shipinspection/{ID}")
    public ResponseEntity <shipinspection> updateShipInspection(@PathVariable Integer ID, @RequestBody shipinspection shipinspectionDetail) {
        shipinspection shipinspection=shipinspectionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        shipinspection.setID(shipinspectionDetail.getID());
        shipinspection.setComponents(shipinspectionDetail.getComponents());
        shipinspection.setForeignBody(shipinspectionDetail.getForeignBody());
        shipinspection.setInspectionTime(shipinspectionDetail.getInspectionTime());
        shipinspection.setLable(shipinspectionDetail.getLable());
        shipinspection.setPacking(shipinspectionDetail.getPacking());
        shipinspection.setDescription(shipinspectionDetail.getDescription());
        shipinspection.setSmell(shipinspectionDetail.getSmell());
        shipinspection.setProductCode(shipinspectionDetail.getProductCode());
        shipinspection.setWriteDate(shipinspectionDetail.getWriteDate());
        shipinspection.setWriter(shipinspectionDetail.getWriter());
        shipinspection updateShipInspection = shipinspectionRepository.save(shipinspection);
        return ResponseEntity.ok(updateShipInspection);
    }
    @PutMapping("/shiporderdoc/{ID}")
    public ResponseEntity <shiporderdoc> updateShipOrderDoc(@PathVariable Integer ID, @RequestBody shiporderdoc shiporderdocDetail) {
        shiporderdoc shiporderdoc=shiporderdocRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        shiporderdoc.setID(shiporderdocDetail.getID());
        shiporderdoc.setBarCode(shiporderdocDetail.getBarCode());
        shiporderdoc.setCarryover(shiporderdocDetail.getCarryover());
        shiporderdoc.setClientCompany(shiporderdocDetail.getClientCompany());
        shiporderdoc.setManager(shiporderdocDetail.getManager());
        shiporderdoc.setOrderNumber(shiporderdocDetail.getOrderNumber());
        shiporderdoc.setDescription(shiporderdocDetail.getDescription());
        shiporderdoc.setRealRetention(shiporderdocDetail.getRealRetention());
        shiporderdoc.setShipOrderDate(shiporderdocDetail.getShipOrderDate());
        shiporderdoc.setProductCode(shiporderdocDetail.getProductCode());
        shiporderdoc.setQuantity(shiporderdocDetail.getQuantity());
        shiporderdoc.setShippingDate(shiporderdocDetail.getShippingDate());
        shiporderdoc.setShipOrderDocNumber(shiporderdocDetail.getShipOrderDocNumber());
        shiporderdoc.setWriteDate(shiporderdocDetail.getWriteDate());
        shiporderdoc.setWriter(shiporderdocDetail.getWriter());
        shiporderdoc.setShippingQuantity(shiporderdocDetail.getShippingQuantity());
        shiporderdoc.setShipRemainder(shiporderdocDetail.getShipRemainder());
        shiporderdoc.setState(shiporderdocDetail.getState());
        shiporderdoc updateShipOrderDoc = shiporderdocRepository.save(shiporderdoc);
        return ResponseEntity.ok(updateShipOrderDoc);
    }
    @PutMapping("/sort/{ID}")
    public ResponseEntity <sort> updateSort(@PathVariable Integer ID, @RequestBody sort sortDetail) {
        sort sort=sortRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        sort.setID(sortDetail.getID());
        sort.setBigSort(sortDetail.getBigSort());
        sort.setSortCode(sortDetail.getSortCode());
        sort.setSortName(sortDetail.getSortName());
        sort.setDescription(sortDetail.getDescription());
        sort.setWriteDate(sortDetail.getWriteDate());
        sort.setWriter(sortDetail.getWriter());
        sort updateSort = sortRepository.save(sort);
        return ResponseEntity.ok(updateSort);
    }
    @PutMapping("/temperature/{ID}")
    public ResponseEntity <temperature> updateTemperature(@PathVariable Integer ID, @RequestBody temperature temperatureDetail) {
        temperature temperature=temperatureRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        temperature.setID(temperatureDetail.getID());
        temperature.setChName(temperatureDetail.getChName());
        temperature.setTemperature(temperatureDetail.getTemperature());
        temperature.setWriteDate(temperatureDetail.getWriteDate());
        temperature updateTemperature = temperatureRepository.save(temperature);
        return ResponseEntity.ok(updateTemperature);
    }
    @PutMapping("/temperaturecheck/{ID}")
    public ResponseEntity <temperaturecheck> updateTemperaturecheck(@PathVariable Integer ID, @RequestBody temperaturecheck temperaturecheckDetail) {
        temperaturecheck temperaturecheck=temperaturecheckRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        temperaturecheck.setID(temperaturecheckDetail.getID());
        temperaturecheck.setChecker(temperaturecheckDetail.getChecker());
        temperaturecheck.setCheckTime(temperaturecheckDetail.getCheckTime());
        temperaturecheck.setImproving(temperaturecheckDetail.getImproving());
        temperaturecheck.setManager(temperaturecheckDetail.getManager());
        temperaturecheck.setMaterialFreezer(temperaturecheckDetail.getMaterialFreezer());
        temperaturecheck.setDescription(temperaturecheckDetail.getDescription());
        temperaturecheck.setProblem(temperaturecheckDetail.getProblem());
        temperaturecheck.setRawFreezer(temperaturecheckDetail.getRawFreezer());
        temperaturecheck.setRipeningRoom(temperaturecheckDetail.getRipeningRoom());
        temperaturecheck.setThawRoom(temperaturecheckDetail.getThawRoom());
        temperaturecheck.setWriteDate(temperaturecheckDetail.getWriteDate());
        temperaturecheck.setWriter(temperaturecheckDetail.getWriter());
        temperaturecheck updateTemperaturecheck = temperaturecheckRepository.save(temperaturecheck);
        return ResponseEntity.ok(updateTemperaturecheck);
    }
    @PutMapping("/unit/{ID}")
    public ResponseEntity <unit> updateUnit(@PathVariable Integer ID, @RequestBody unit unitDetail) {
        unit unit=unitRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        unit.setID(unitDetail.getID());
        unit.setUnit(unitDetail.getUnit());
        unit.setDescription(unitDetail.getDescription());
        unit.setWriteDate(unitDetail.getWriteDate());
        unit.setWriter(unitDetail.getWriter());
        unit updateUnit = unitRepository.save(unit);
        return ResponseEntity.ok(updateUnit);
    }
    @PutMapping("/usepage/{ID}")
    public ResponseEntity <usepage> updateUsePage(@PathVariable Integer ID, @RequestBody usepage usepageDetail) {
        usepage usepage=usepageRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        usepage.setID(usepageDetail.getID());
        usepage.setBigMenu(usepageDetail.getBigMenu());
        usepage.setLavorer(usepageDetail.getLavorer());
        usepage.setManager(usepageDetail.getManager());
        usepage.setMaster(usepageDetail.getMaster());
        usepage.setPageName(usepageDetail.getPageName());
        usepage.setSubMenu(usepageDetail.getSubMenu());
        usepage.setWriteDate(usepageDetail.getWriteDate());
        usepage.setWriter(usepageDetail.getWriter());
        usepage updateUsePage = usepageRepository.save(usepage);
        return ResponseEntity.ok(updateUsePage);
    }
    @PutMapping("/warehouse/{ID}")
    public ResponseEntity <warehouse> updateWareHouse(@PathVariable Integer ID, @RequestBody warehouse warehouseDetail) {
        warehouse warehouse=warehouseRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        warehouse.setID(warehouseDetail.getID());
        warehouse.setWarehouseCode(warehouseDetail.getWarehouseCode());
        warehouse.setWarehouseName(warehouseDetail.getWarehouseName());
        warehouse.setDescription(warehouseDetail.getDescription());
        warehouse.setWriteDate(warehouseDetail.getWriteDate());
        warehouse.setWriter(warehouseDetail.getWriter());
        warehouse updateWareHouse = warehouseRepository.save(warehouse);
        return ResponseEntity.ok(updateWareHouse);
    }
    @PutMapping("/wash/{ID}")
    public ResponseEntity <wash> updateWash(@PathVariable Integer ID, @RequestBody wash washDetail) {
        wash wash=washRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        wash.setID(washDetail.getID());
        wash.setChecker(washDetail.getChecker());
        wash.setCleaningMethod(washDetail.getCleaningMethod());
        wash.setImproving(washDetail.getImproving());
        wash.setInputWater(washDetail.getInputWater());
        wash.setManager(washDetail.getManager());
        wash.setDescription(washDetail.getDescription());
        wash.setProblem(washDetail.getProblem());
        wash.setWashTime(washDetail.getWashTime());
        wash.setProductCode(washDetail.getProductCode());
        wash.setWater(washDetail.getWater());
        wash.setWaterChange(washDetail.getWaterChange());
        wash.setWriteDate(washDetail.getWriteDate());
        wash.setWriter(washDetail.getWriter());
        wash updateWash = washRepository.save(wash);
        return ResponseEntity.ok(updateWash);
    }
    @PutMapping("/weight/{ID}")
    public ResponseEntity <weight> updateWeight(@PathVariable Integer ID, @RequestBody weight weightDetail) {
        weight weight=weightRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        weight.setID(weightDetail.getID());
        weight.setUnit(weightDetail.getUnit());
        weight.setWeight(weightDetail.getWeight());
        weight.setWriteDate(weightDetail.getWriteDate());
        weight updateWeight = weightRepository.save(weight);
        return ResponseEntity.ok(updateWeight);
    }
    @PutMapping("/weight_rec/{ID}")
    public ResponseEntity <weight_rec> updateWeight_rec(@PathVariable Integer ID, @RequestBody weight_rec weight_recDetail) {
        weight_rec weight_rec=weight_recRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        weight_rec.setID(weight_recDetail.getID());
        weight_rec.setUnit(weight_recDetail.getUnit());
        weight_rec.setNumber(weight_recDetail.getNumber());
        weight_rec.setWeight(weight_recDetail.getWeight());
        weight_rec.setWriteDate(weight_recDetail.getWriteDate());
        weight_rec updateWeight_rec = weight_recRepository.save(weight_rec);
        return ResponseEntity.ok(updateWeight_rec);
    }
    @PutMapping("/worker/{ID}")
    public ResponseEntity <worker> updateWorker(@PathVariable Integer ID, @RequestBody worker workerDetail) {
        worker worker=workerRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        worker.setBelong(workerDetail.getBelong());
        worker.setID(workerDetail.getID());
        worker.setBlockedDate(workerDetail.getBlockedDate());
        worker.setBlockedUser(workerDetail.getBlockedUser());
        worker.setCountry(workerDetail.getCountry());
        worker.setDepartment(workerDetail.getDepartment());
        worker.setFont(workerDetail.getFont());
        worker.setHiredate(workerDetail.getHiredate());
        worker.setLoginBlock(workerDetail.getLoginBlock());
        worker.setMESAutority(workerDetail.getMESAutority());
        worker.setName(workerDetail.getName());
        worker.setPassword(workerDetail.getPassword());
        worker.setPosition(workerDetail.getPosition());
        worker.setPWCDate(workerDetail.getPWCDate());
        worker.setWriter(workerDetail.getWriter());
        worker.setSkin(workerDetail.getSkin());
        worker.setTask(workerDetail.getTask());
        worker.setWorkerCode(workerDetail.getWorkerCode());
        worker updateWorker = workerRepository.save(worker);
        return ResponseEntity.ok(updateWorker);
    }
    @PutMapping("/workorderdoc/{ID}")
    public ResponseEntity <workorderdoc> updateWorkOrderDoc(@PathVariable Integer ID, @RequestBody workorderdoc workorderdocDetail) {
        workorderdoc workorderdoc=workorderdocRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        workorderdoc.setID(workorderdocDetail.getID());
        workorderdoc.setCheckDate(workorderdocDetail.getCheckDate());
        workorderdoc.setConfirmMan(workorderdocDetail.getConfirmMan());
        workorderdoc.setDueDate(workorderdocDetail.getDueDate());
        workorderdoc.setMaterialCode(workorderdocDetail.getMaterialCode());
        workorderdoc.setMTotalQuantity(workorderdocDetail.getMTotalQuantity());
        workorderdoc.setDescription(workorderdocDetail.getDescription());
        workorderdoc.setOrderNumber(workorderdocDetail.getOrderNumber());
        workorderdoc.setPriority(workorderdocDetail.getPriority());
        workorderdoc.setProductCode(workorderdocDetail.getProductCode());
        workorderdoc.setProcessChartName1(workorderdocDetail.getProcessChartName1());
        workorderdoc.setProcessChartName2(workorderdocDetail.getProcessChartName2());
        workorderdoc.setPTotalQuantity(workorderdocDetail.getPTotalQuantity());
        workorderdoc.setWriteDate(workorderdocDetail.getWriteDate());
        workorderdoc.setWriter(workorderdocDetail.getWriter());
        workorderdoc.setRemainder(workorderdocDetail.getRemainder());
        workorderdoc.setShipRemainder(workorderdocDetail.getShipRemainder());
        workorderdoc.setState(workorderdocDetail.getState());
        workorderdoc.setWorkOrderDocNumber(workorderdocDetail.getWorkOrderDocNumber());
        workorderdoc.setWorkload(workorderdocDetail.getWorkload());
        workorderdoc updateWorkOrderDoc = workorderdocRepository.save(workorderdoc);
        return ResponseEntity.ok(updateWorkOrderDoc);
    }
    @PutMapping("/workperformance/{ID}")
    public ResponseEntity <workperformance> updateWorkPerformance(@PathVariable Integer ID, @RequestBody workperformance workperformanceDetail) {
        workperformance workperformance=workperformanceRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        workperformance.setID(workperformanceDetail.getID());
        workperformance.setLavorer(workperformanceDetail.getLavorer());
        workperformance.setProcessCode(workperformanceDetail.getProcessCode());
        workperformance.setWorkOrderDocNumber(workperformanceDetail.getWorkOrderDocNumber());
        workperformance.setDescription(workperformanceDetail.getDescription());
        workperformance.setWriteDate(workperformanceDetail.getWriteDate());
        workperformance.setWriter(workperformanceDetail.getWriter());
        workperformance updateWorkPerformance = workperformanceRepository.save(workperformance);
        return ResponseEntity.ok(updateWorkPerformance);
    }
    @PutMapping("/workstandard/{ID}")
    public ResponseEntity <workstandard> updateWorkStandard(@PathVariable Integer ID, @RequestBody workstandard workstandardDetail) {
        workstandard workstandard=workstandardRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        workstandard.setID(workstandardDetail.getID());
        workstandard.setDocument(workstandardDetail.getDocument());
        workstandard.setPrecautions(workstandardDetail.getPrecautions());
        workstandard.setProcessName(workstandardDetail.getProcessName());
        workstandard.setTestCycle(workstandardDetail.getTestCycle());
        workstandard.setTreatment(workstandardDetail.getTreatment());
        workstandard.setWorkCode(workstandardDetail.getWorkCode());
        workstandard.setWorkContents(workstandardDetail.getWorkContents());
        workstandard.setWorkName(workstandardDetail.getWorkName());
        workstandard.setWriteDate(workstandardDetail.getWriteDate());
        workstandard.setWriter(workstandardDetail.getWriter());
        workstandard updateWorkStandard = workstandardRepository.save(workstandard);
        return ResponseEntity.ok(updateWorkStandard);
    }
    @DeleteMapping("/barcode/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteBarcode(@PathVariable Integer ID) {
        barcode barcode=barcodeRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        barcodeRepository.delete(barcode);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/bom/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteBom(@PathVariable Integer ID) {
        bom bom=bomRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        bomRepository.delete(bom);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/client/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteClient(@PathVariable Integer ID) {
        client client=clientRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        clientRepository.delete(client);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/customer/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteCustomer(@PathVariable Integer ID) {
        customer customer=customerRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        customerRepository.delete(customer);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/department/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteDepartment(@PathVariable Integer ID) {
        department department=departmentRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        departmentRepository.delete(department);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/equipment/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteEquipment(@PathVariable Integer ID) {
        equipment equipment=equipmentRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        equipmentRepository.delete(equipment);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/equipmentchecklist/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteEquipmentCheckList(@PathVariable Integer ID) {
        equipmentchecklist equipmentchecklist=equipmentchecklistRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        equipmentchecklistRepository.delete(equipmentchecklist);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/equipmentcheck/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteEquipmentCheck(@PathVariable Integer ID) {
        equipmentcheck equipmentcheck=equipmentcheckRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        equipmentcheckRepository.delete(equipmentcheck);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/equipmentinspection/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteEquipmentInspection(@PathVariable Integer ID) {
        equipmentinspection equipmentinspection=equipmentinspectionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        equipmentinspectionRepository.delete(equipmentinspection);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/equipmentprevention/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteEquipmentPrevention(@PathVariable Integer ID) {
        equipmentprevention equipmentprevention=equipmentpreventionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        equipmentpreventionRepository.delete(equipmentprevention);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/errorcode/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteErrorCode(@PathVariable Integer ID) {
        errorcode errorcode=errorcodeRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        errorcodeRepository.delete(errorcode);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/fileboard/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteFileBoard(@PathVariable Integer ID) {
        fileboard fileboard=fileboardRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        fileboardRepository.delete(fileboard);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/filter/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteFilter(@PathVariable Integer ID) {
        filter filter=filterRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        filterRepository.delete(filter);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/heating/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteHeating(@PathVariable Integer ID) {
        heating heating=heatingRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        heatingRepository.delete(heating);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/inventory/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteInventory(@PathVariable Integer ID) {
        inventory inventory=inventoryRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        inventoryRepository.delete(inventory);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/lavorer/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteLavoer(@PathVariable Integer ID) {
        lavorer lavorer=lavorerRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        lavorerRepository.delete(lavorer);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/loginlog/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteLoginLog(@PathVariable Integer ID) {
        loginlog loginlog=loginlogRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        loginlogRepository.delete(loginlog);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/materialmove/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteMaterialMove(@PathVariable Integer ID) {
        materialmove materialmove=materialmoveRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        materialmoveRepository.delete(materialmove);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/noticeboard/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteNoticeBoard(@PathVariable Integer ID) {
        noticeboard noticeboard=noticeboardRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        noticeboardRepository.delete(noticeboard);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/orderdoc/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteOrderDoc(@PathVariable Integer ID) {
        orderdoc orderdoc=orderdocRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        orderdocRepository.delete(orderdoc);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/orders/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteOrders(@PathVariable Integer ID) {
        orders orders=ordersRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        ordersRepository.delete(orders);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/ordersheet/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteOrderSheet(@PathVariable Integer ID) {
        ordersheet ordersheet=ordersheetRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        ordersheetRepository.delete(ordersheet);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/placeorderdoc/{ID}")
    public ResponseEntity <Map<String,Boolean>> deletePlaceOrderDoc(@PathVariable Integer ID) {
        placeorderdoc placeorderdoc=placeorderdocRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        placeorderdocRepository.delete(placeorderdoc);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/placeorders/{ID}")
    public ResponseEntity <Map<String,Boolean>> deletePlaceOrders(@PathVariable Integer ID) {
        placeorders placeorders=placeordersRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        placeordersRepository.delete(placeorders);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/position/{ID}")
    public ResponseEntity <Map<String,Boolean>> deletePosition(@PathVariable Integer ID) {
        position position=positionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        positionRepository.delete(position);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/process/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteProcess(@PathVariable Integer ID) {
        process process=processRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        processRepository.delete(process);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/processchart/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteProcessChart(@PathVariable Integer ID) {
        processchart processchart=processchartRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        processchartRepository.delete(processchart);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/processcode/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteProcessCode(@PathVariable Integer ID) {
        processcode processcode=processcodeRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        processcodeRepository.delete(processcode);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/product/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteProduct(@PathVariable Integer ID) {
        product product=productRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        productRepository.delete(product);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/productcorrect/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteProductCorrect(@PathVariable Integer ID) {
        productcorrect productcorrect=productcorrectRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        productcorrectRepository.delete(productcorrect);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/producthistory/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteProductHistory(@PathVariable Integer ID) {
        producthistory producthistory=producthistoryRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        producthistoryRepository.delete(producthistory);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/productmove/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteProductMove(@PathVariable Integer ID) {
        productmove productmove=productmoveRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        productmoveRepository.delete(productmove);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/productreturn/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteProductReturn(@PathVariable Integer ID) {
        productreturn productreturn=productreturnRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        productreturnRepository.delete(productreturn);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/qainspection/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteQAInspection(@PathVariable Integer ID) {
        qainspection qainspection=qainspectionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        qainspectionRepository.delete(qainspection);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/qaproduct/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteQAproduct(@PathVariable Integer ID) {
        qaproduct qaproduct=qaproductRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        qaproductRepository.delete(qaproduct);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/rawhistory/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteRawHistory(@PathVariable Integer ID) {
        rawhistory rawhistory=rawhistoryRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        rawhistoryRepository.delete(rawhistory);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/rawinspection/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteRawInspection(@PathVariable Integer ID) {
        rawinspection rawinspection=rawinspectionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        rawinspectionRepository.delete(rawinspection);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/rawmaterial/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteRawMaterial(@PathVariable Integer ID) {
        rawmaterial rawmaterial=rawmaterialRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        rawmaterialRepository.delete(rawmaterial);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/rawmaterialmaster/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteRawmaterialMaster(@PathVariable Integer ID) {
        rawmaterialmaster rawmaterialmaster=rawmaterialmasterRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        rawmaterialmasterRepository.delete(rawmaterialmaster);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/rawmaterialtag/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteRawMaterialtag(@PathVariable Integer ID) {
        rawmaterialtag rawmaterialtag=rawmaterialtagRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        rawmaterialtagRepository.delete(rawmaterialtag);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/rfid/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteD(@PathVariable Integer ID) {
        rfid rfid=rfidRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        rfidRepository.delete(rfid);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/rfid_barrel/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteRFID_Barrel(@PathVariable Integer ID) {
        rfid_barrel rfid_barrel=rfid_barrelRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        rfid_barrelRepository.delete(rfid_barrel);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/setplus/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteSetPlus(@PathVariable Integer ID) {
        setplus setplus=setplusRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        setplusRepository.delete(setplus);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/shipinspection/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteShipInspection(@PathVariable Integer ID) {
        shipinspection shipinspection=shipinspectionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        shipinspectionRepository.delete(shipinspection);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/shiporderdoc/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteShipOrderDoc(@PathVariable Integer ID) {
        shiporderdoc shiporderdoc=shiporderdocRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        shiporderdocRepository.delete(shiporderdoc);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/sort/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteSort(@PathVariable Integer ID) {
        sort sort=sortRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        sortRepository.delete(sort);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/temperature/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteTemperature(@PathVariable Integer ID) {
        temperature temperature=temperatureRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        temperatureRepository.delete(temperature);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/temperaturecheck/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteTemperaturecheck(@PathVariable Integer ID) {
        temperaturecheck temperaturecheck=temperaturecheckRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        temperaturecheckRepository.delete(temperaturecheck);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/unit/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteUnit(@PathVariable Integer ID) {
        unit unit=unitRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        unitRepository.delete(unit);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/usepage/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteUsePage(@PathVariable Integer ID) {
        usepage usepage=usepageRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        usepageRepository.delete(usepage);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/warehouse/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteWareHouse(@PathVariable Integer ID) {
        warehouse warehouse=warehouseRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        warehouseRepository.delete(warehouse);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/wash/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteWash(@PathVariable Integer ID) {
        wash wash=washRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        washRepository.delete(wash);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/weight/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteWeight(@PathVariable Integer ID) {
        weight weight=weightRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        weightRepository.delete(weight);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/weight_rec/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteWeight_rec(@PathVariable Integer ID) {
        weight_rec weight_rec=weight_recRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        weight_recRepository.delete(weight_rec);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/worker/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteWorker(@PathVariable Integer ID) {
        worker worker=workerRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        workerRepository.delete(worker);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/workorderdoc/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteWorkOrderDoc(@PathVariable Integer ID) {
        workorderdoc workorderdoc=workorderdocRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        workorderdocRepository.delete(workorderdoc);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/workperformance/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteWorkPerformance(@PathVariable Integer ID) {
        workperformance workperformance=workperformanceRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        workperformanceRepository.delete(workperformance);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/workstandard/{ID}")
    public ResponseEntity <Map<String,Boolean>> deleteWorkStandard(@PathVariable Integer ID) {
        workstandard workstandard=workstandardRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        workstandardRepository.delete(workstandard);
        Map<String, Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
