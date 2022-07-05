package com.lianwei.OAsystem.serivce;

import com.lianwei.OAsystem.dao.AttendanceDao;
import com.lianwei.OAsystem.po.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

public class AttendanceServiceImp implements AttendanceService {

    @Autowired
    private AttendanceDao attendanceDao;


    @Override
    @Transactional(readOnly = true)
    public Long queryAttendanceYes() {
        return this.attendanceDao.queryAttendanceYes();
    }

    @Override
    @Transactional(readOnly = true)
    public Long queryAttendanceCount() {
        return this.attendanceDao.queryAttendanceCount();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Attendance> selectAttendanceByAttendEmpNo(Integer attendEmpNo) {
        return this.attendanceDao.selectAttendanceByAttendEmpNo(attendEmpNo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Attendance> selectAllAttendance(Attendance attendance) {
        return this.attendanceDao.selectAllAttendance(attendance);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Attendance> selectAttendanceLikeList(Attendance attendance) {
        return this.attendanceDao.selectAttendanceLikeList(attendance);
    }


    @Override
    public void insertAttendance(Attendance attendance) {
        this.attendanceDao.insertAttendance(attendance);
    }

    @Override
    public void updateAttendance(Attendance attendance) {
        this.attendanceDao.updateAttendance(attendance);
    }

    @Override
    public void deleteAttendanceByAttendEmpNo(Integer attendEmpNo) {
        this.attendanceDao.deleteAttendanceByAttendEmpNo(attendEmpNo);
    }

    @Override
    public void deleteAttendanceByAttendEmpNos(Integer[] attendEmpNos) {
        this.attendanceDao.deleteAttendanceByAttendEmpNos(attendEmpNos);
    }
}
