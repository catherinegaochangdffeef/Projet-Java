

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bookmanage
-- ----------------------------
DROP TABLE IF EXISTS `bookmanage`;
CREATE TABLE `bookmanage`  (
  `BookNo` int(255) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `Book` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'nom de livre',
  `Author` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'auteur\r\n',
  `Lend` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'déjà emprunté? ',
  PRIMARY KEY (`BookNo`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of bookmanage
-- ----------------------------
INSERT INTO `bookmanage` VALUES (1, 'Gargantua', 'François Rabelais', 'no');
INSERT INTO `bookmanage` VALUES (2, 'Pensées de Pascal', 'Blaise Pascal', 'yes');
INSERT INTO `bookmanage` VALUES (3, 'La Malade imaginaire', 'Molière', 'yes');
INSERT INTO `bookmanage` VALUES (4, 'Candide', 'Voltaire', 'no');
INSERT INTO `bookmanage` VALUES (5, 'Le Rouge et le Noir', 'Stendhal', 'yes');
INSERT INTO `bookmanage` VALUES (7, 'La Peau de chagrin', 'Balzac', 'no');
INSERT INTO `bookmanage` VALUES (8, 'Notre-Dame', 'Victor Hugo', 'yes');
INSERT INTO `bookmanage` VALUES (10, 'Le père Goriot', 'Balzac', 'yes');

-- ----------------------------
-- Table structure for borrowhistory
-- ----------------------------
DROP TABLE IF EXISTS `borrowhistory`;
CREATE TABLE `borrowhistory`  (
  `BookNo` int(255) NOT NULL COMMENT 'id',
  `Borrower` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'emprunteur',
  `Book` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'nom de livre',
  `Date` datetime(0) NOT NULL COMMENT 'date d''emprunte ',
  `Lend` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'situation emprunte',
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'emprunte id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of borrowhistory
-- ----------------------------
INSERT INTO `borrowhistory` VALUES (1, '2', 'Gargantua', '2019-07-24 00:00:00', 'emprunté', 22);
INSERT INTO `borrowhistory` VALUES (2, '2', 'Pensées de Pascal', '2019-07-24 00:00:00', 'emprunté', 23);
INSERT INTO `borrowhistory` VALUES (2, '2', 'Pensées de Pascal', '2019-07-24 00:00:00', 'retourné', 24);
INSERT INTO `borrowhistory` VALUES (2, 'wanide', 'Pensées de Pascal', '2019-07-25 00:00:00', 'emprunté', 25);
INSERT INTO `borrowhistory` VALUES (7, '2', 'La Peau de chagrin', '2019-08-17 00:00:00', 'emprunté', 26);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(13) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `admin` int(1) NOT NULL,
  PRIMARY KEY (`username`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('Jerry', '000000', 'Jerry', 0);
INSERT INTO `user` VALUES ('Tom', '000000', 'tom', 0);
INSERT INTO `user` VALUES ('wanide', '000000', 'lyr', 1);

SET FOREIGN_KEY_CHECKS = 1;
