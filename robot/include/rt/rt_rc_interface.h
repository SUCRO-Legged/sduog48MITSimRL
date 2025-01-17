/**
 * @file rt_rc_interface.h
 *
 */
#ifndef _RT_RC_INTERFACE
#define _RT_RC_INTERFACE

class rc_control_settings {
  public:
    double     mode;
    double     p_des[2]; // (x, y) -1 ~ 1
    double     height_variation; // -1 ~ 1
    double     v_des[3]; // -1 ~ 1 * (scale 0.5 ~ 1.5)
    double     rpy_des[3]; // -1 ~ 1
    double     omega_des[3]; // -1 ~ 1
    double     variable[3];
    double     step_height;
};


namespace RC_mode{
  constexpr int OFF = 0;
  constexpr int STAND_UP =1;
  constexpr int READY=2;
  constexpr int QP_STAND = 3;
  constexpr int BACKFLIP_PRE = 4;
  constexpr int BACKFLIP = 5;
  constexpr int VISION = 6;

  constexpr int LOCOMOTION = 11;
  constexpr int RECOVERY_STAND = 12;
  constexpr int FRONT_JUMP=13;
  constexpr int STAND_DOWN=15;
  constexpr int DANCE=16;
  constexpr int HINDLEGS_STAND=17;
  constexpr int HALFCIRCLE_JUMP=18;
  constexpr int TURN_OVER=19;
  constexpr int BUFFERED_LANDING=20;
  constexpr int FRONT_LONG_JUMP=21;
  constexpr int RL_TEST=22;

  constexpr int ZOOM_SHOW=222;
  constexpr int WALK=21;


  constexpr int  VMLOCOMOTION = 101; //测试阶段模式
  constexpr int  VMWBCLOCOMOTION = 102; //测试阶段模式
  constexpr int  NEW_VMWBCLOCOMOTION = 104;

  // Experiment Mode
  constexpr int TWO_LEG_STANCE_PRE = 20;
  constexpr int TWO_LEG_STANCE = 21;

  constexpr int WAIT=31;
  // directly control
  constexpr int JOINT_CONTROL=68;
};

void sbus_packet_complete();
void sbus_packet_complete_at9s();

void get_rc_control_settings(void* settings);
//void get_rc_channels(void* settings);

void* v_memcpy(void* dest, volatile void* src, size_t n);

float deadband(float command, float deadbandRegion, float minVal, float maxVal);

#endif
