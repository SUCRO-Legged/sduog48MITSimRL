include_directories("./")
include_directories("../../robot/include")
include_directories("../../common/include/")
include_directories("../../third-party/")
include_directories(SYSTEM "../../third-party/qpOASES/include")
include_directories("../../third-party/ParamHandler")

include_directories("../../lcm-types/cpp")
include_directories("/usr/local/include/lcm/")   # lcm includes
include_directories("/usr/local/include/eigen3")   # eigen3 includes
include_directories(${PROJECT_SOURCE_DIR})
set(use_onnx ON)
if(use_onnx)
    set(ONNXRUNTIME_DIR "~/packages/onnxruntime")
    include_directories(${ONNXRUNTIME_DIR}/include)
    link_directories(${ONNXRUNTIME_DIR}/lib)
endif()

file(GLOB_RECURSE sources
"./*.cpp"
"FSM_States/*.cpp" 
)

add_executable(mit_ctrl ${sources} MIT_Controller.cpp)
target_link_libraries(mit_ctrl robot biomimetics)
target_link_libraries(mit_ctrl dynacore_param_handler qpOASES)
target_link_libraries(mit_ctrl Goldfarb_Optimizer osqp)

if(use_onnx)
    target_link_libraries(mit_ctrl onnxruntime)
endif()

include_directories(${CMAKE_BINARY_DIR})
