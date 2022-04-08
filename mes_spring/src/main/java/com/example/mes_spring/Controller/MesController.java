package com.example.mes_spring.Controller;

import com.example.mes_spring.Repository.*;
import com.example.mes_spring.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.lang.RuntimeException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity <barcode> updateBarcodeByID(@PathVariable Integer ID, @RequestBody barcode barcodeDetail) {
        barcode barcode=barcodeRepository.findById(ID)
            .orElseThrow(()->new RuntimeException("{ID}"));
        barcode.setBarcode((barcodeDetail.getBarcode()));
        barcode.setDevice((barcodeDetail.getDevice()));
        barcode.setID((barcodeDetail.getID()));
        barcode.setProductCode((barcodeDetail.getProductCode()));
        barcode.setProductName((barcodeDetail.getProductName()));
        barcode.setWriteDate((barcodeDetail.getWriteDate()));
        return ResponseEntity.ok(barcode);
}
    @PutMapping("/bom/{ID}")
    public ResponseEntity <bom> updateBomByID(@PathVariable Integer ID, @RequestBody bom bomDetail) {
        bom bom=bomRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        bom.setID((bomDetail.getID()));
        bom.setProductCode((bomDetail.getProductCode()));
        bom.setBomName((bomDetail.getBomName()));
        bom.setBomcode((bomDetail.getBomcode()));
        bom.setMaterialBom((bomDetail.getMaterialBom()));
        bom.setDescription((bomDetail.getDescription()));
        return ResponseEntity.ok(bom);
    }
    @PutMapping("/client/{ID}")
    public ResponseEntity <client> updateClientByID(@PathVariable Integer ID, @RequestBody client clientDetail) {
        client client=clientRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        client.
        return ResponseEntity.ok(client);
    }
    @PutMapping("/customer/{ID}")
    public ResponseEntity <customer> updateCustomerByID(@PathVariable Integer ID, @RequestBody customer customerDetail) {
        customer customer=customerRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        customer.
        return ResponseEntity.ok(customer);
    }
    @PutMapping("/department/{ID}")
    public ResponseEntity <department> updateDepartmentByID(@PathVariable Integer ID, @RequestBody department departmentDetail) {
        department department=departmentRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        department.
        return ResponseEntity.ok(department);
    }
    @PutMapping("/equipment/{ID}")
    public ResponseEntity <equipment> updateEquipmentByID(@PathVariable Integer ID, @RequestBody equipment equipmentDetail) {
        equipment equipment=equipmentRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        equipment.
        return ResponseEntity.ok(equipment);
    }
    @PutMapping("/equipmentchecklist/{ID}")
    public ResponseEntity <equipmentchecklist> updateEquipmentCheckListByID(@PathVariable Integer ID, @RequestBody equipmentchecklist equipmentchecklistDetail) {
        equipmentchecklist equipmentchecklist=equipmentchecklistRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        equipmentchecklist.
        return ResponseEntity.ok(equipmentchecklist);
    }
    @PutMapping("/equipmentcheck/{ID}")
    public ResponseEntity <equipmentcheck> updateEquipmentCheckByID(@PathVariable Integer ID, @RequestBody equipmentcheck equipmentcheckDetail) {
        equipmentcheck equipmentcheck=equipmentcheckRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        equipmentcheck.
        return ResponseEntity.ok(equipmentcheck);
    }
    @PutMapping("/equipmentinspection/{ID}")
    public ResponseEntity <equipmentinspection> updateEquipmentInspectionByID(@PathVariable Integer ID, @RequestBody equipmentinspection equipmentinspectionDetail) {
        equipmentinspection equipmentinspection=equipmentinspectionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        equipmentinspection.
        return ResponseEntity.ok(equipmentinspection);
    }
    @PutMapping("/equipmentprevention/{ID}")
    public ResponseEntity <equipmentprevention> updateEquipmentPreventionByID(@PathVariable Integer ID, @RequestBody equipmentprevention equipmentpreventionDetail) {
        equipmentprevention equipmentprevention=equipmentpreventionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        equipmentprevention.
        return ResponseEntity.ok(equipmentprevention);
    }
    @PutMapping("/errorcode/{ID}")
    public ResponseEntity <errorcode> updateErrorCodeByID(@PathVariable Integer ID, @RequestBody errorcode errorcodeDetail) {
        errorcode errorcode=errorcodeRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        errorcode.
        return ResponseEntity.ok(errorcode);
    }
    @PutMapping("/fileboard/{ID}")
    public ResponseEntity <fileboard> updateFileBoardByID(@PathVariable Integer ID, @RequestBody fileboard fileboardDetail) {
        fileboard fileboard=fileboardRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        fileboard.
        return ResponseEntity.ok(fileboard);
    }
    @PutMapping("/filter/{ID}")
    public ResponseEntity <filter> updateFilterByID(@PathVariable Integer ID, @RequestBody filter filterDetail) {
        filter filter=filterRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        filter.
        return ResponseEntity.ok(filter);
    }
    @PutMapping("/heating/{ID}")
    public ResponseEntity <heating> updateHeatingByID(@PathVariable Integer ID, @RequestBody heating heatingDetail) {
        heating heating=heatingRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        heating.
        return ResponseEntity.ok(heating);
    }
    @PutMapping("/inventory/{ID}")
    public ResponseEntity <inventory> updateInventoryByID(@PathVariable Integer ID, @RequestBody inventory inventoryDetail) {
        inventory inventory=inventoryRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        inventory.
        return ResponseEntity.ok(inventory);
    }
    @PutMapping("/lavorer/{ID}")
    public ResponseEntity <lavorer> updateLavoerByID(@PathVariable Integer ID, @RequestBody lavorer lavorerDetail) {
        lavorer lavorer=lavorerRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        lavorer.
        return ResponseEntity.ok(lavorer);
    }
    @PutMapping("/loginlog/{ID}")
    public ResponseEntity <loginlog> updateLoginLogByID(@PathVariable Integer ID, @RequestBody loginlog loginlogDetail) {
        loginlog loginlog=loginlogRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        loginlog.
        return ResponseEntity.ok(loginlog);
    }
    @PutMapping("/materialmove/{ID}")
    public ResponseEntity <materialmove> updateMaterialMoveByID(@PathVariable Integer ID, @RequestBody materialmove materialmoveDetail) {
        materialmove materialmove=materialmoveRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        materialmove.
        return ResponseEntity.ok(materialmove);
    }
    @PutMapping("/noticeboard/{ID}")
    public ResponseEntity <noticeboard> updateNoticeBoardByID(@PathVariable Integer ID, @RequestBody noticeboard noticeboardDetail) {
        noticeboard noticeboard=noticeboardRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        noticeboard.
        return ResponseEntity.ok(noticeboard);
    }
    @PutMapping("/orderdoc/{ID}")
    public ResponseEntity <orderdoc> updateOrderDocByID(@PathVariable Integer ID, @RequestBody orderdoc orderdocDetail) {
        orderdoc orderdoc=orderdocRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        orderdoc.
        return ResponseEntity.ok(orderdoc);
    }
    @PutMapping("/orders/{ID}")
    public ResponseEntity <orders> updateOrdersByID(@PathVariable Integer ID, @RequestBody orders ordersDetail) {
        orders orders=ordersRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        orders.
        return ResponseEntity.ok(orders);
    }
    @PutMapping("/ordersheet/{ID}")
    public ResponseEntity <ordersheet> updateOrderSheetByID(@PathVariable Integer ID, @RequestBody ordersheet ordersheetDetail) {
        ordersheet ordersheet=ordersheetRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        ordersheet.
        return ResponseEntity.ok(ordersheet);
    }
    @PutMapping("/placeorderdoc/{ID}")
    public ResponseEntity <placeorderdoc> updatePlaceOrderDocByID(@PathVariable Integer ID, @RequestBody placeorderdoc placeorderdocDetail) {
        placeorderdoc placeorderdoc=placeorderdocRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        placeorderdoc.
        return ResponseEntity.ok(placeorderdoc);
    }
    @PutMapping("/placeorders/{ID}")
    public ResponseEntity <placeorders> updatePlaceOrdersByID(@PathVariable Integer ID, @RequestBody placeorders placeordersDetail) {
        placeorders placeorders=placeordersRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        placeorders.
        return ResponseEntity.ok(placeorders);
    }
    @PutMapping("/position/{ID}")
    public ResponseEntity <position> updatePositionByID(@PathVariable Integer ID, @RequestBody position positionDetail) {
        position position=positionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        position.
        return ResponseEntity.ok(position);
    }
    @PutMapping("/process/{ID}")
    public ResponseEntity <process> updateProcessByID(@PathVariable Integer ID, @RequestBody process processDetail) {
        process process=processRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        process.
        return ResponseEntity.ok(process);
    }
    @PutMapping("/processchart/{ID}")
    public ResponseEntity <processchart> updateProcessChartByID(@PathVariable Integer ID, @RequestBody processchart processchartDetail) {
        processchart processchart=processchartRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        processchart.
        return ResponseEntity.ok(processchart);
    }
    @PutMapping("/processcode/{ID}")
    public ResponseEntity <processcode> updateProcessCodeByID(@PathVariable Integer ID, @RequestBody processcode processcodeDetail) {
        processcode processcode=processcodeRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        processcode.
        return ResponseEntity.ok(processcode);
    }
    @PutMapping("/product/{ID}")
    public ResponseEntity <product> updateProductByID(@PathVariable Integer ID, @RequestBody product productDetail) {
        product product=productRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        product.
        return ResponseEntity.ok(product);
    }
    @PutMapping("/productcorrect/{ID}")
    public ResponseEntity <productcorrect> updateProductCorrectByID(@PathVariable Integer ID, @RequestBody productcorrect productcorrectDetail) {
        productcorrect productcorrect=productcorrectRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        productcorrect.
        return ResponseEntity.ok(productcorrect);
    }
    @PutMapping("/producthistory/{ID}")
    public ResponseEntity <producthistory> updateProductHistoryByID(@PathVariable Integer ID, @RequestBody producthistory producthistoryDetail) {
        producthistory producthistory=producthistoryRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        producthistory.
        return ResponseEntity.ok(producthistory);
    }
    @PutMapping("/productmove/{ID}")
    public ResponseEntity <productmove> updateProductMoveByID(@PathVariable Integer ID, @RequestBody productmove productmoveDetail) {
        productmove productmove=productmoveRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        productmove.
        return ResponseEntity.ok(productmove);
    }
    @PutMapping("/productreturn/{ID}")
    public ResponseEntity <productreturn> updateProductReturnByID(@PathVariable Integer ID, @RequestBody productreturn productreturnDetail) {
        productreturn productreturn=productreturnRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        productreturn.
        return ResponseEntity.ok(productreturn);
    }
    @PutMapping("/qainspection/{ID}")
    public ResponseEntity <qainspection> updateQAInspectionByID(@PathVariable Integer ID, @RequestBody qainspection qainspectionDetail) {
        qainspection qainspection=qainspectionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        qainspection.
        return ResponseEntity.ok(qainspection);
    }
    @PutMapping("/qaproduct/{ID}")
    public ResponseEntity <qaproduct> updateQAproductByID(@PathVariable Integer ID, @RequestBody qaproduct qaproductDetail) {
        qaproduct qaproduct=qaproductRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        qaproduct.
        return ResponseEntity.ok(qaproduct);
    }
    @PutMapping("/rawhistory/{ID}")
    public ResponseEntity <rawhistory> updateRawHistoryByID(@PathVariable Integer ID, @RequestBody rawhistory rawhistoryDetail) {
        rawhistory rawhistory=rawhistoryRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        rawhistory.
        return ResponseEntity.ok(rawhistory);
    }
    @PutMapping("/rawinspection/{ID}")
    public ResponseEntity <rawinspection> updateRawInspectionByID(@PathVariable Integer ID, @RequestBody rawinspection rawinspectionDetail) {
        rawinspection rawinspection=rawinspectionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        rawinspection.
        return ResponseEntity.ok(rawinspection);
    }
    @PutMapping("/rawmaterial/{ID}")
    public ResponseEntity <rawmaterial> updateRawMaterialByID(@PathVariable Integer ID, @RequestBody rawmaterial rawmaterialDetail) {
        rawmaterial rawmaterial=rawmaterialRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        rawmaterial.
        return ResponseEntity.ok(rawmaterial);
    }
    @PutMapping("/rawmaterialmaster/{ID}")
    public ResponseEntity <rawmaterialmaster> updateRawmaterialMasterByID(@PathVariable Integer ID, @RequestBody rawmaterialmaster rawmaterialmasterDetail) {
        rawmaterialmaster rawmaterialmaster=rawmaterialmasterRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        rawmaterialmaster.
        return ResponseEntity.ok(rawmaterialmaster);
    }
    @PutMapping("/rawmaterialtag/{ID}")
    public ResponseEntity <rawmaterialtag> updateRawMaterialtagByID(@PathVariable Integer ID, @RequestBody rawmaterialtag rawmaterialtagDetail) {
        rawmaterialtag rawmaterialtag=rawmaterialtagRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        rawmaterialtag.
        return ResponseEntity.ok(rawmaterialtag);
    }
    @PutMapping("/rfid/{ID}")
    public ResponseEntity <rfid> updateDByID(@PathVariable Integer ID, @RequestBody rfid rfidDetail) {
        rfid rfid=rfidRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        rfid.
        return ResponseEntity.ok(rfid);
    }
    @PutMapping("/rfid_barrel/{ID}")
    public ResponseEntity <rfid_barrel> updateRFID_BarrelByID(@PathVariable Integer ID, @RequestBody rfid_barrel rfid_barrelDetail) {
        rfid_barrel rfid_barrel=rfid_barrelRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        rfid_barrel.
        return ResponseEntity.ok(rfid_barrel);
    }
    @PutMapping("/setplus/{ID}")
    public ResponseEntity <setplus> updateSetPlusByID(@PathVariable Integer ID, @RequestBody setplus setplusDetail) {
        setplus setplus=setplusRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        setplus.
        return ResponseEntity.ok(setplus);
    }
    @PutMapping("/shipinspection/{ID}")
    public ResponseEntity <shipinspection> updateShipInspectionByID(@PathVariable Integer ID, @RequestBody shipinspection shipinspectionDetail) {
        shipinspection shipinspection=shipinspectionRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        shipinspection.
        return ResponseEntity.ok(shipinspection);
    }
    @PutMapping("/shiporderdoc/{ID}")
    public ResponseEntity <shiporderdoc> updateShipOrderDocByID(@PathVariable Integer ID, @RequestBody shiporderdoc shiporderdocDetail) {
        shiporderdoc shiporderdoc=shiporderdocRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        shiporderdoc.
        return ResponseEntity.ok(shiporderdoc);
    }
    @PutMapping("/sort/{ID}")
    public ResponseEntity <sort> updateSortByID(@PathVariable Integer ID, @RequestBody sort sortDetail) {
        sort sort=sortRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        sort.
        return ResponseEntity.ok(sort);
    }
    @PutMapping("/temperature/{ID}")
    public ResponseEntity <temperature> updateTemperatureByID(@PathVariable Integer ID, @RequestBody temperature temperatureDetail) {
        temperature temperature=temperatureRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        temperature.
        return ResponseEntity.ok(temperature);
    }
    @PutMapping("/temperaturecheck/{ID}")
    public ResponseEntity <temperaturecheck> updateTemperaturecheckByID(@PathVariable Integer ID, @RequestBody temperaturecheck temperaturecheckDetail) {
        temperaturecheck temperaturecheck=temperaturecheckRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        temperaturecheck.
        return ResponseEntity.ok(temperaturecheck);
    }
    @PutMapping("/unit/{ID}")
    public ResponseEntity <unit> updateUnitByID(@PathVariable Integer ID, @RequestBody unit unitDetail) {
        unit unit=unitRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        unit.
        return ResponseEntity.ok(unit);
    }
    @PutMapping("/usepage/{ID}")
    public ResponseEntity <usepage> updateUsePageByID(@PathVariable Integer ID, @RequestBody usepage usepageDetail) {
        usepage usepage=usepageRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        usepage.
        return ResponseEntity.ok(usepage);
    }
    @PutMapping("/warehouse/{ID}")
    public ResponseEntity <warehouse> updateWareHouseByID(@PathVariable Integer ID, @RequestBody warehouse warehouseDetail) {
        warehouse warehouse=warehouseRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        warehouse.
        return ResponseEntity.ok(warehouse);
    }
    @PutMapping("/wash/{ID}")
    public ResponseEntity <wash> updateWashByID(@PathVariable Integer ID, @RequestBody wash washDetail) {
        wash wash=washRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        wash.
        return ResponseEntity.ok(wash);
    }
    @PutMapping("/weight/{ID}")
    public ResponseEntity <weight> updateWeightByID(@PathVariable Integer ID, @RequestBody weight weightDetail) {
        weight weight=weightRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        weight.
        return ResponseEntity.ok(weight);
    }
    @PutMapping("/weight_rec/{ID}")
    public ResponseEntity <weight_rec> updateWeight_recByID(@PathVariable Integer ID, @RequestBody weight_rec weight_recDetail) {
        weight_rec weight_rec=weight_recRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        weight_rec.
        return ResponseEntity.ok(weight_rec);
    }
    @PutMapping("/worker/{ID}")
    public ResponseEntity <worker> updateWorkerByID(@PathVariable Integer ID, @RequestBody worker workerDetail) {
        worker worker=workerRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        worker.
        return ResponseEntity.ok(worker);
    }
    @PutMapping("/workorderdoc/{ID}")
    public ResponseEntity <workorderdoc> updateWorkOrderDocByID(@PathVariable Integer ID, @RequestBody workorderdoc workorderdocDetail) {
        workorderdoc workorderdoc=workorderdocRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        workorderdoc.
        return ResponseEntity.ok(workorderdoc);
    }
    @PutMapping("/workperformance/{ID}")
    public ResponseEntity <workperformance> updateWorkPerformanceByID(@PathVariable Integer ID, @RequestBody workperformance workperformanceDetail) {
        workperformance workperformance=workperformanceRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        workperformance.
        return ResponseEntity.ok(workperformance);
    }
    @PutMapping("/workstandard/{ID}")
    public ResponseEntity <workstandard> updateWorkStandardByID(@PathVariable Integer ID, @RequestBody workstandard workstandardDetail) {
        workstandard workstandard=workstandardRepository.findById(ID)
                .orElseThrow(()->new RuntimeException("{ID}"));
        workstandard.
        return ResponseEntity.ok(workstandard);
    }

}
