package com.example.springbootdemo.serivce;

import com.example.springbootdemo.dao.AttendanceDao;
import com.example.springbootdemo.po.Attendance;
import com.example.springbootdemo.po.Department;
import com.example.springbootdemo.po.Info;
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
    public List<Attendance> selectAttendanceByAttendEmpNo(Integer attendEmpNo) {
        return this.attendanceDao.selectAttendanceByAttendEmpNo(attendEmpNo);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Attendance> selectAttendanceList(Attendance attendance) {
        return this.attendanceDao.selectAttendanceList(attendance);
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
