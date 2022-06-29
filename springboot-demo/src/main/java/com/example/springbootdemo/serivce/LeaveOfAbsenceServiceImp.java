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
    @Transactional(readOnly = true)
    public List<LeaveOfAbsence> selectLeaveOfAbsenceByLeaveId(Integer leaveId) {
        return this.leaveofabsenceDao.selectLeaveOfAbsenceByLeaveId(leaveId);
    }

    @Override
    @Transactional(readOnly = true)
    public List<LeaveOfAbsence> selectAllLeaveOfAbsence(LeaveOfAbsence leaveofabsence) {
        return this.leaveofabsenceDao.selectAllLeaveOfAbsence(leaveofabsence);
    }

    @Override
    @Transactional(readOnly = true)
    public List<LeaveOfAbsence> selectLeaveOfAbsenceLikeList(LeaveOfAbsence leaveofabsence) {
        return this.leaveofabsenceDao.selectLeaveOfAbsenceLikeList(leaveofabsence);
    }

    @Override
    @Transactional(readOnly = true)
    public Long queryLeaveOfAbsenceCount() {
        return this.leaveofabsenceDao.queryLeaveOfAbsenceCount();
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

    @Override
    public void deleteLeaveOfAbsenceByLeaveIds(Integer[] leaveIds) {
        this.leaveofabsenceDao.deleteLeaveOfAbsenceByLeaveIds(leaveIds);
    }
}
