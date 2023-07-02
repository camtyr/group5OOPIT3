/*tạo database quản lý công việc*/use master
CREATE DATABASE QLCV
GO
USE QLCV
GO

/*tạo bảng Account*/
CREATE TABLE Account
(
 TaiKhoan NVARCHAR(50) PRIMARY KEY,
 MatKhau NVARCHAR(50) not null,
 Email NVARCHAR(50) not null,
)
GO

/*tạo bảng Công việc*/
CREATE TABLE CongViec
(
 ID INT PRIMARY KEY,
 TenCongViec NVARCHAR(50) not null,
 NgayKhoiTao DATE not null,
 NgayHetHan DATE not null,
 NgayHoanThanh NVARCHAR(50),
 MoTaCongViec NVARCHAR(50),
 TrangThai NVARCHAR(50),
 --TaiKhoan NVARCHAR(50) CONSTRAINT kn_CongViec FOREIGN KEY(TaiKhoan) REFERENCES Account(TaiKhoan) ON UPDATE CASCADE
)
GO 



/*thêm dữ liệu vào bảng Account*/
INSERT INTO Account(TaiKhoan, MatKhau, Email)
VALUES
(N'duc', N'duc123', N'duc@gmail.com'),
(N'dang12', N'quatao', N'dang32@gmail.com'),
(N'hien34', N'hien3030', N'hien34@gmail.com'),
(N'dung322', N'd322', N'dung845@gmail.com'),
(N'vitcon', N'ngancon', N'duck56@gmail.com'),
(N'mailan', N'maii55', N'mlan85@gmail.com'),
(N'dungdang72', N'd888', N'dungxg@gmail.com'),
(N'caloo48', N'caca934', N'john828@gmail.com'),
(N'thaitu333', N'thai13', N'thaiht@gmail.com'),
(N'tuann8534', N'tuan47', N'ttuan2@gmai.com'),
(N'dinhhongvu222', N'dinhhv254', N'hongvu56@gmail.com')
;
GO



/*thêm dữ liệu vào bảng công việc*/
INSERT INTO CongViec(ID, TenCongViec, NgayKhoiTao, NgayHetHan, NgayHoanThanh, MoTaCongViec, TrangThai)
VALUES
(1, N'Code giao ứng dụng QLNH', '2018-01-24', '2018-02-16', '2018-02-10', N'code xong trước th', N'đã hoàn thành'),
(2, N'Làm đồ án OOP', '2019-01-14', '2019-04-30', '2019-03-25', N'viết mô tả bài toán', N'đã hoàn thành'),
(3, N'Tập thể dục', '2019-02-26', '2020-05-26', '', N'chạy bộ buổi sáng 3 vòng', N'đã quá hạn'),
(4, N'Đi du lịch', '2019-02-27', '2019-03-02', '2019-03-02', N'', N'đã hoàn thành'),
(5, N'training ielts', '2019-06-30', '2019-07-30', '2019-07-29', N'chiều/tối 2 tiếng', N'đã hoàn thành'),
(6, N'đánh bóng bàn', '2019-09-01', '2019-09-09', '', N'', N'đã quá hạn'),
(8, N'bài tập toán rời rạc', '2019-11-11', '2019-12-04', '', N'bài 3->9+12',  N'đã quá hạn'),
(9, N'Code bài tập java', '2020-01-14', '2020-01-20', '2020-01-18', N'', N'đã hoàn thành'),
(10, N'Viết báo cáo', '2020-01-25', '2020-01-26', '2020-01-25', N'', N'đã hoàn thành'),
(11, N'debug chương trình PJ', '2020-03-22', '2020-03-28', '2020-03-26', N'', N'đã hoàn thành'),
(13, N'Đi công tác', '2020-05-26', '2020-06-04', '2020-06-04', N'công tác 1 tuần', N'đã hoàn thành'),
(14, N'Note chi tiêu tháng 6', '2020-06-01', '2020-06-30', '2020-06-30', N't6: 2tr', N'đã hoàn thành'),
(15, N'Đi tour', '2020-07-24', '2020-07-27', '2020-07-26', N'', N'đã hoàn thành'),
(16, N'làm bài tập JS + CSS + HTML', '2020-11-12', '2020-11-21', '2020-11-18', N'làm bài trên link zalo', N'đã hoàn thành'),
(17, N'Test ứng dụng', '2020-12-22', '2020-12-25', '2020-12-24', N'', N'đã hoàn thành'),
(18, N'Ôn tập cuối kì', '2021-03-28', '2021-04-30', '', N'đề cương 3 môn toán-văn-anh', N'đã quá hạn'),
(19, N'Code chức năng đăng nhập', '2021-07-24', '2021-07-25', '', N'đăng nhập + đăng kí hệ thống', N'đã quá hạn'),
(20, N'Chuẩn bị bộ kiểm thử', '2021-08-03', '2021-08-05', '', N'', N'đã quá hạn'),
(21, N'Chế độ cân bằng dinh dưỡng', '2022-03-23', '2022-05-31', '2022-05-31', N'ăn uống đúng chế độ', N'đã hoàn thành'),
(22, N'Edit video và ảnh', '2022-07-10', '2022-07-13', '2022-07-12', 'vid sunstone, sage', N'đã hoàn thành'),
(23, N'chuẩn bị powerpoint', '2023-12-24', '2023-12-27', '', N'', N'chưa hoàn thành'),
(24, N'setup consert', '2023-12-26', '2024-01-04', '', N'sảnh lớn, cánh gà', N'chưa hoàn thành'),
(25, N'Làm bài tập tiếng anh', '2023-12-29', '2023-12-30', '', N'bài 2->4 trang 21', N'chưa hoàn thành')
;
GO







/*thêm dữ liệu vào bảng công việc*/
-- Phần này có thể bỏ qua vì là mục thử nghiệm
/*INSERT INTO CongViec(ID, TenCongViec, NgayKhoiTao, NgayHetHan, NgayHoanThanh, MoTaCongViec, TrangThai, TaiKhoan)
VALUES
(1, N'Code giao ứng dụng QLNH', '2018-01-24', '2018-02-16', '2018-02-10', N'code xong trước th', N'đã hoàn thành', N'dang12'),
(2, N'Làm đồ án OOP', '2019-01-14', '2019-04-30', '2019-03-25', N'viết mô tả bài toán', N'đã hoàn thành', N'duc'),
(3, N'Tập thể dục', '2019-02-26', '2020-05-26', '', N'chạy bộ buổi sáng 3 vòng', N'đã quá hạn', N'dang12'),
(4, N'Đi du lịch', '2019-02-27', '2019-03-02', '2019-03-02', N'', N'đã hoàn thành', N'hien34'),
(5, N'training ielts', '2019-06-30', '2019-07-30', '2019-07-29', N'chiều/tối 2 tiếng', N'đã hoàn thành', N'dang12'),
(6, N'đánh bóng bàn', '2019-09-01', '2019-09-09', '', N'', N'đã quá hạn', N'duc'),
(8, N'bài tập toán rời rạc', '2019-11-11', '2019-12-04', '', N'bài 3->9+12',  N'đã quá hạn', N'dang12'),
(9, N'Code bài tập java', '2020-01-14', '2020-01-20', '2020-01-18', N'', N'đã hoàn thành', N'duc'),
(10, N'Viết báo cáo', '2020-01-25', '2020-01-26', '2020-01-25', N'', N'đã hoàn thành', N'duc'),
(11, N'debug chương trình PJ', '2020-03-22', '2020-03-28', '2020-03-26', N'', N'đã hoàn thành', N'dung322'),
(13, N'Đi công tác', '2020-05-26', '2020-06-04', '2020-06-04', N'công tác 1 tuần', N'đã hoàn thành', N'hien34'),
(14, N'Note chi tiêu tháng 6', '2020-06-01', '2020-06-30', '2020-06-30', N't6: 2tr', N'đã hoàn thành', N'dang12'),
(15, N'Đi tour', '2020-07-24', '2020-07-27', '2020-07-26', N'', N'đã hoàn thành', N'dang12'),
(16, N'làm bài tập JS + CSS + HTML', '2020-11-12', '2020-11-21', '2020-11-18', N'làm bài trên link zalo', N'đã hoàn thành', N'dung322'),
(17, N'Test ứng dụng', '2020-12-22', '2020-12-25', '2020-12-24', N'', N'đã hoàn thành', N'dung322'),
(18, N'Ôn tập cuối kì', '2021-03-28', '2021-04-30', '', N'đề cương 3 môn toán-văn-anh', N'đã quá hạn', N'dang12'),
(19, N'Code chức năng đăng nhập', '2021-07-24', '2021-07-25', '', N'đăng nhập + đăng kí hệ thống', N'đã quá hạn', N'dung322'),
(20, N'Chuẩn bị bộ kiểm thử', '2021-08-03', '2021-08-05', '', N'', N'đã quá hạn', N'duc'),
(21, N'Chế độ cân bằng dinh dưỡng', '2022-03-23', '2022-05-31', '2022-05-31', N'ăn uống đúng chế độ', N'đã hoàn thành', N'dang12'),
(22, N'Edit video và ảnh', '2022-07-10', '2022-07-13', '2022-07-12', 'vid sunstone, sage', N'đã hoàn thành', N'duc'),
(23, N'chuẩn bị powerpoint', '2023-12-24', '2023-12-27', '', N'', N'chưa hoàn thành', N'duc'),
(24, N'setup consert', '2023-12-26', '2024-01-04', '', N'sảnh lớn, cánh gà', N'chưa hoàn thành', N'dang12'),
(25, N'Làm bài tập tiếng anh', '2023-12-29', '2023-12-30', '', N'bài 2->4 trang 21', N'chưa hoàn thành', N'hien34')
;
GO
*/