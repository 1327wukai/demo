package com.example.springbootdemo.serivce;

import com.example.springbootdemo.dao.LeaveOfAbsenceDao;
import com.example.springbootdemo.po.LeaveOfAbsence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LeaveOfAbsenceServiceImp implements LeaveOfAbsenceService {

    @Autowired
    private LeaveOfAbsenceDao leaveofabsenceDao;

    @Override
    public List<LeaveOfAbsence> selectLeaveOfAbsenceByLeaveId(Integer leaveId) {
        return this.leaveofabsenceDao.selectLeaveOfAbsenceByLeaveId(leaveId);
    }

    @Override
    public List<LeaveOfAbsence> selectLeaveOfAbsenceList(LeaveOfAbsence leaveofabsence) {
        return this.leaveofabsenceDao.selectLeaveOfAbsenceList(leaveofabsence);
    }

    @Override
    public void insertLeaveOfAbsence(LeaveOfAbsence leaveofabsence) {
        this.leaveofabsenceDao.insertLeaveOfAbsence(leaveofabsence);
    }

    @Override
    public void updateLeaveOfAbsence(LeaveOfAbsence leaveofabsence) {
        this.leaveofabsenceDao.updateLeaveOfAbsence(leaveofabsence);
    }

    @Override
    public void deleteLeaveOfAbsenceByLeaveId(Integer leaveId) {
        this.leaveofabsenceDao.deleteLeaveOfAbsenceByLeaveId(leaveId);
    }

}
