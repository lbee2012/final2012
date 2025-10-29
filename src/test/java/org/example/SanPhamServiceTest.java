package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamServiceTest {
    SanPhamService spService;

    @BeforeEach
    void setUp() {
        spService = new SanPhamService();
    }

    @Test
    void add_soLuong_ok() {
        SanPham sp = new SanPham("SP001", "Dien thoai", 12, 5000f, 10, "Dien tu");
        boolean result = spService.add(sp);
        assertTrue(result);
    }
    @Test
    void add_soLuong_throw() {
        SanPham sp = new SanPham("SP001", "Dien thoai", 12, 5000f, 100000, "Dien tu");
        assertThrows(IllegalArgumentException.class, () -> spService.add(sp));
    }

    @Test
    void add_maSP_duplicated_throw() {
        SanPham sp = new SanPham("SP001", "Dien thoai", 12, 5000f, 10, "Dien tu");
        SanPham sp1 = new SanPham("SP001", "Dien thoai", 12, 5000f, 10, "Dien tu");
        spService.add(sp);
        assertThrows(IllegalArgumentException.class, () -> spService.add(sp1));
    }

    @Test
    void add_soLuong_upperBoundary_ok() {
        SanPham sp = new SanPham("SP001", "Dien thoai", 12, 5000f, 100, "Dien tu");
        boolean result = spService.add(sp);
        assertTrue(result);
    }
    @Test
    void add_soLuong_belowBoundary_ok() {
        SanPham sp = new SanPham("SP001", "Dien thoai", 12, 5000f, 1, "Dien tu");
        boolean result = spService.add(sp);
        assertTrue(result);
    }
    @Test
    void add_soLuong_moreThan_upperBoundary_throw() {
        SanPham sp = new SanPham("SP001", "Dien thoai", 12, 5000f, 101, "Dien tu");
        assertThrows(IllegalArgumentException.class, () -> spService.add(sp));
    }
    @Test
    void add_soLuong_lessThan_upperBoundary_ok() {
        SanPham sp = new SanPham("SP001", "Dien thoai", 12, 5000f, 99, "Dien tu");
        boolean result = spService.add(sp);
        assertTrue(result);
    }
    @Test
    void add_soLuong_moreThan_belowBoundary_ok() {
        SanPham sp = new SanPham("SP001", "Dien thoai", 12, 5000f, 2, "Dien tu");
        boolean result = spService.add(sp);
        assertTrue(result);
    }
    @Test
    void add_soLuong_lessThan_belowBoundary_throw() {
        SanPham sp = new SanPham("SP001", "Dien thoai", 12, 5000f, 0, "Dien tu");
        assertThrows(IllegalArgumentException.class, () -> spService.add(sp));
    }
}